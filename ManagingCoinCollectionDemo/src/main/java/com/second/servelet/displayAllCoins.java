package com.second.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.second.dao.CoinDAO;
import com.second.models.Coin;

/**
 * Servlet implementation class displayAllCoins
 */
@WebServlet("/displayAllCoins")
public class displayAllCoins extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public displayAllCoins() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		try {
			
//			Retrive all coins from the database
			CoinDAO coinDAO = new CoinDAO();
			List<Coin> allCoins = coinDAO.getAllCoins();
			
//			HTML Response
			
			out.print("<html><head><title>Display Coins</title></head><body>");
			out.println("<h1>All Coin Colllection</h1>");
			out.println("<table border='1'>");
			out.println("<thead><tr><th>COIN ID<th><th>COUNTRY<th><th>DENOMINATION<th><th>TEAR OF MINTING<th><th>CURRENT VALUE<th><th>AQUIRED DATE<th></tr></thead><");
			out.println("<tr>");
			out.println("<th>COIN ID<th>");
			out.println("<th>COUNTRY<th>");
			out.println("<th>DENOMINATION<th>");
			out.println("<th>TEAR OF MINTING<th>");
			out.println("<th>CURRENT VALUE<th>");
			out.println("<th>AQUIRED DATE<th>");
			out.println("</table>");
			out.print("<a href='Index.html'>Back to Home</a>");
			out.print("</body></html>");
			
		}catch(Exception e)
		{
			//error
			e.printStackTrace();
			out.print("<html><head><title>Adding coin</title></head><body>");
			out.print("<h1> coin not added</h1>");
			out.print("<a href='Index.html'>back to home</a>");
			out.print("Error :"+ e.getMessage());
			out.print("</body></html>");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
