package it.objectmethod.dataworld.dao;

import java.util.List;

import it.objectmethod.dataworld.model.City;

public interface ICityDao {

	
	
	public List<City> getCities(String contryCode);
	
	
}
