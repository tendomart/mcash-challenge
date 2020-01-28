package com.mcash.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mcash.auth.model.NormalUser;

public interface NormalUserDaoImpl extends CrudRepository<NormalUser, Long> {

}
