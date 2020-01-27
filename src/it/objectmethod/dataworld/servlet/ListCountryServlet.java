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
import it.objectmethod.dataworld.model.Country;


@WebServlet("/ListCountryServlet")
public class ListCountryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListCountryServlet() {
        super();
    }

    
    
    
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Country> listCountry = null;
		HttpSession session = req.getSession();
		
		//logica per session
		String nameC = req.getParameter("name_cont");
		if(nameC == null) {
			nameC = (String) session.getAttribute("cont_visitato");
		} else {
			session.setAttribute("cont_visitato", nameC);
		}
		
		ICountryDao countryDao = new CountryDao();
		
		listCountry = countryDao.getCountry(nameC);
		
		req.setAttribute("countryList", listCountry);
		
		req.getRequestDispatcher("pages/show-country.jsp").forward(req, resp);
	}
}

