package com.mcash.repository;

import org.springframework.data.repository.CrudRepository;

import com.mcash.model.Customer;

public interface CustomerDaoImpl extends CrudRepository<Customer, Long> {

}
