package it.objectmethod.dataworld.dao;

import java.util.List;

import it.objectmethod.dataworld.model.Country;

public interface ICountryDao {

	
	public List<Country> getCountry(String nameCont);
	
	public List<String> getContinent();
	
}
