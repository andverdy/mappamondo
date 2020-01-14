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

import it.objectmethod.dataworld.dao.ICityDao;
import it.objectmethod.dataworld.dao.impl.CityDao;
import it.objectmethod.dataworld.model.City;


@WebServlet("/ListCityServlet")
public class ListCityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ListCityServlet() {
        super();
    }

    
   	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   		String contryCode = req.getParameter("country_code");
   		List<City> listCity = new ArrayList<>();
   		ICityDao cityDao = new CityDao();
   		listCity = cityDao.getCities(contryCode);
   		
   		req.setAttribute("cityList", listCity);
   		req.getRequestDispatcher("pages/show-city.jsp").forward(req, resp);
   	}

	

}
