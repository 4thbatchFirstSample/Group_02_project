package com.spring.boot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.entities.Defect;

public interface DefectRepository extends JpaRepository<Defect, Long>{
	public List<Defect> findBySubModuleId(Long SubModuleId);
}
