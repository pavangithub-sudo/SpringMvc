package com.pav.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pav.entity.CountryEntity;
import com.pav.repository.CountryRepository;
@Service("countryService")
public class CountryService {
	@Autowired
	CountryRepository countryRepository;
	
	@Transactional
	 public List getAllCountries() {
	  List countries=new ArrayList();
	  Iterable countriesIterable=countryRepository.findAll();
	  Iterator countriesIterator=countriesIterable.iterator();
	  while(countriesIterator.hasNext())
	  {
	   countries.add(countriesIterator.next());
	  }
	  return countries;
	 }
	@Transactional
	 public void addCountry(CountryEntity country) {
	  countryRepository.save(country);
	 }
}
