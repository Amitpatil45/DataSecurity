package com.datasecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datasecurity.entity.Role;

public interface roleRepository extends JpaRepository<Role, Long> {

}
