package com.pav.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.pav.entity.CountryEntity;

public interface CountryRepository extends CrudRepository<CountryEntity, Integer>{
	

}
