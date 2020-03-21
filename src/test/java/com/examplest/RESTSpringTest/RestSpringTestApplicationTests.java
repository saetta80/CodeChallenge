package com.examplest.RESTSpringTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import com.examples.RESTSpringTest.Controller.CountryController;

import com.examples.RESTSpringTest.Model.Country;

import com.examples.RESTSpringTest.Service.CountryService;

@RunWith(SpringRunner.class)
@WebMvcTest(CountryController.class)
public class RestSpringTestApplicationTests
{

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	CountryService countryService;

	private final String URL = "/api/v1/countrycode/";

	@Test
	public void addAuthorTest() throws Exception
	{
		// prepare data and mock's behaviour
		Country countryStub = new Country("ARW", "AR","name","region","adminregion","incomelevel","lending");
		when(countryService.getById("ARW")).thenReturn((List<Country>) countryStub);

		// execute
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post(URL).contentType(MediaType.APPLICATION_JSON_UTF8)
		//		.accept(MediaType.APPLICATION_JSON).content(authStub)).andReturn();
		      .accept(MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.ALL).content(TestUtils.objectToJson(countryStub))).andReturn();

		// verify
		int status = result.getResponse().getStatus();
		assertEquals("Incorrect Response Status", HttpStatus.OK.value(), status);

		// verify that service method was called once
		//verify(countryService).getById(id);

		Country country = TestUtils.jsonToObject(result.getResponse().getContentAsString(), Country.class);
		assertNotNull(country);
		assertEquals("ARW", country.getId());

	}

}
