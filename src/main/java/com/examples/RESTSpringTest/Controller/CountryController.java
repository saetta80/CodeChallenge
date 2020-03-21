package com.examples.RESTSpringTest.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.examples.RESTSpringTest.Model.Country;
import com.examples.RESTSpringTest.Results.ResponseWrapper;
import com.examples.RESTSpringTest.Service.CountryService;
import com.examples.RESTSpringTest.Service.CountryServiceImpl;

import javax.validation.Valid;
import java.util.List;


@Validated
@RestController
@RequestMapping("/api/v1/countrycode")
public class CountryController
{

	@Autowired
	private CountryServiceImpl countryService;
	@GetMapping(value = "/{id}")
	public ResponseWrapper<List<Country>> getCountryById(
			@Valid 
			@PathVariable(value = "id") String id, Pageable pageable )
	{
		return new ResponseWrapper<List<Country>>(countryService.getById(id),HttpStatus.CREATED );
	}

}
