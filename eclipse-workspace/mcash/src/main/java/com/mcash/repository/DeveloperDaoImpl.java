package com.mcash.repository;

import org.springframework.data.repository.CrudRepository;

import com.mcash.auth.model.Developer;

public interface DeveloperDaoImpl extends CrudRepository<Developer,Long> {

}
