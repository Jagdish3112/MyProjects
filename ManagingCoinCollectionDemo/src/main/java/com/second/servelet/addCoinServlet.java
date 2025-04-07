package com.second.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

import com.second.constant.GenericConstants;
import com.second.dao.CoinDAO;
import com.second.models.Coin;

/**
 * Servlet implementation class addCoinServlet
 */
@WebServlet("/addCoinServlet")
public class addCoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public addCoinServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response html type :
		response.setContentType("text/html");
//        IO stream create		
		PrintWriter out = response.getWriter(); 
        
		
		String country =request.getParameter("country");
		String denomination =request.getParameter("denomination");
		int yearOfMinting = Integer.parseInt(request.getParameter("yearOfMinting"));
		double currentValue = Double.parseDouble(request.getParameter("currentValue"));
		Date aquiredDate = new Date();
		
		try {
			 aquiredDate = new SimpleDateFormat(GenericConstants.requiredDateFormate).parse(request.getParameter("acquiredDate"));
		
		
		Coin coin = new Coin(country, denomination, yearOfMinting, currentValue, aquiredDate);
		
		CoinDAO coinDAO = new CoinDAO();
		
		if(coinDAO.addCoin(coin) == true )
		{
		   //success
			out.print("<html><head><title>Adding coin</title></head><body>");
			out.print("<h1> coin added Succeccfully</h1>");
			out.print("<p> coin ID :"+ coin.getId() + "<p>");
			out.print("<p> coin country :"+ coin.getCountry() + "<p>");
			out.print("<p> coin denomination :"+ coin.getDenomination() + "<p>");
			out.print("<p> coin yearofminting :"+ coin.getYearofminting() + "<p>");
			out.print("<p> coin current value :"+ coin.getCurrentValue() + "<p>");
			out.print("<p> coin aquired date :"+ coin.getAcquiredDate() + "<p>");
			out.print("<a href='Index.html'>add another coin</a>");
			out.print("</body></html>");
		}else
		{
			//fail
			out.print("<html><head><title>Adding coin</title></head><body>");
			out.print("<h1> coin not added</h1>");
			out.print("<a href='Index.html'>try adding another coin</a>");
			out.print("</body></html>");
			
		}
		} catch (ParseException| NumberFormatException e) {
//			error
			e.printStackTrace();
			out.print("<html><head><title>Adding coin</title></head><body>");
			out.print("<h1> coin not added</h1>");
			out.print("<a href='Index.html'>try adding coin</a>");
			out.print("coin aquired date :"+ e.getMessage());
			out.print("</body></html>");
			
		}
	}

}






