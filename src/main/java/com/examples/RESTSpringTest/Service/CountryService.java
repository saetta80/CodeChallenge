package com.examples.RESTSpringTest.Service;

import java.util.List;

import com.examples.RESTSpringTest.Model.Country;


public abstract class CountryService
{
	public abstract List<Country> getById( String id );
}
