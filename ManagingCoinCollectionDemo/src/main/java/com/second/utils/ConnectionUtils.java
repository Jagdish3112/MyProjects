package com.second.utils;

import java.sql.Connection;
import java.sql.DriverManager;

import com.second.constant.DatabaseConstants;

public class ConnectionUtils {

	static Connection conection;
	public static Connection getConnection()
	{
		try {
			Class.forName(DatabaseConstants.mysqlDriverClassName);
			conection= DriverManager.getConnection(DatabaseConstants.databaseUrl,DatabaseConstants.databaseUserName,DatabaseConstants.databasePassword);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return conection;
	}
}
