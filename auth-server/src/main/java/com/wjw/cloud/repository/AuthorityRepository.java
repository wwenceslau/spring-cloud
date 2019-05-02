package com.wjw.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wjw.cloud.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}