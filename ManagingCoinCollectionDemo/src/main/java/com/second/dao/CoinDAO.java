package com.second.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.sql.Date;

import com.second.models.Coin;
import com.second.utils.ConnectionUtils;

public class CoinDAO {

	public static void main(String[] args)
	{
		System.out.println(new CoinDAO().addCoin(new Coin("india","INR",1867,100000,new java.util.Date())));
		System.out.println(new CoinDAO().getAllCoins());
	}
	
	
//         get all coins
	public List<Coin>  getAllCoins()
	{
//	     	java8--Type inference
		List<Coin> coins = new ArrayList<>();
		
		try(Connection connection = ConnectionUtils.getConnection())
		{
			Statement statement = connection.createStatement();
			String selectQuery = "select * from coin_collection";
			ResultSet resultSet = statement.executeQuery(selectQuery);
			
			while(resultSet.next())
			{
				Coin coin = new Coin(
						  resultSet.getInt("id"),
						  resultSet.getString("country"),
						  resultSet.getString("denomination"),
						  resultSet.getInt("year_of_minting"),
						  resultSet.getDouble("current_value"),
						  resultSet.getDate("acquired_date"));
				
				coins.add(coin);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return coins;
	}
	
//	add coin in the database
	public boolean addCoin(Coin coin)
	{
		boolean successFlag = false;
		try(Connection connection = ConnectionUtils.getConnection())
		{
			String insertQuery = "insert into coin_collection(country,denomination,year_of_minting,current_value,acquired_date)values (?,?,?,?,?)";   
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			
			preparedStatement.setString(1,coin.getCountry());
			preparedStatement.setString(2,coin.getDenomination());
			preparedStatement.setInt(3,coin.getYearofminting());
			preparedStatement.setDouble(4,coin.getCurrentValue());
			preparedStatement.setDate(5, new Date(coin.getAcquiredDate().getTime()));
			
			System.out.println("Rows Affected :"+ preparedStatement.executeUpdate());
			successFlag=true;
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return successFlag;
	}
}












