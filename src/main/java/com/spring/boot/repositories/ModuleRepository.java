package com.spring.boot.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.entities.Module;

public interface ModuleRepository extends JpaRepository<Module, Long>{
	public List<Module> findByProjectId(Long projectId);

}