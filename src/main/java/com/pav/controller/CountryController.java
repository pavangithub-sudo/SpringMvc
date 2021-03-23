package com.pav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pav.entity.CountryEntity;
import com.pav.model.Country;
import com.pav.service.CountryService;

@Controller
public class CountryController {
	@Autowired
	CountryService countryService;
	
	@RequestMapping(value = "/getAllCountries", method = RequestMethod.GET, headers = "Accept=application/json")
	 public String getCountries(Model model) {
	 
	  List listOfCountries = countryService.getAllCountries();
	  model.addAttribute("country", new Country());
	  model.addAttribute("listOfCountries", listOfCountries);
	  return "countryDetails";
	 }
	
	@RequestMapping(value = "/addCountry", method = RequestMethod.POST, headers = "Accept=application/json")
	 public String addCountry(@ModelAttribute("country") CountryEntity country) { 
	  if(country.getId()==0)
	  {
	   countryService.addCountry(country);
	  }
		/*
		 * else { countryService.updateCountry(country); }
		 */
	  return "redirect:/getAllCountries";
	 }

}
