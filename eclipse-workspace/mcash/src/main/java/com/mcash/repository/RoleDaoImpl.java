package com.mcash.repository;

import org.springframework.data.repository.CrudRepository;

import com.mcash.auth.model.Role;

public interface RoleDaoImpl extends CrudRepository<Role, Long> {

}
