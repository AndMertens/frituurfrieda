package be.vdab.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import be.vdab.entiteiten.*;

import be.vdab.entiteiten.OpenGesloten;


/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/index.htm")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW_WELCOME = "WEB-INF/jsp/index.jsp";
	
	private Adres adres = new Adres();
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		adres.setStraat("Oude Markt");
		adres.setHuisnr("5");
		
		Gemeente gemeente = new Gemeente();
		gemeente.setNaam("Leuven");
		gemeente.setPostCode(3000);
		adres.setGemeente(gemeente);
		
		request.setAttribute("openGesloten", OpenGesloten.getBegroeting());
		request.setAttribute("adres", adres);
		request.getRequestDispatcher(VIEW_WELCOME).forward(request,response);
		
		
	}

	

}
