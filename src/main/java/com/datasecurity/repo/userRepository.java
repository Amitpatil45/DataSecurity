package com.datasecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datasecurity.entity.User;

public interface userRepository extends JpaRepository<User, Long> {

	User findByuserName(String userName);
}
