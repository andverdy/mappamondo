package it.objectmethod.dataworld.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.objectmethod.dataworld.dao.ICountryDao;
import it.objectmethod.dataworld.dao.impl.CountryDao;



@WebServlet("/ListContinentServlet")
public class ListContinentServlet extends HttpServlet {
       
  
	private static final long serialVersionUID = 1L;


	public ListContinentServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<String> listContinent = new ArrayList<>();
		
		ICountryDao continentDao = new CountryDao();
		listContinent = continentDao.getContinent();
		
		req.setAttribute("continentList", listContinent);
		req.getRequestDispatcher("pages/show-continent.jsp").forward(req, resp);
		
	}

}
