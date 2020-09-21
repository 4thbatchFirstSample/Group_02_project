package com.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.entities.Defect;

public interface DefectRepository extends JpaRepository<Defect, Long>{

}
