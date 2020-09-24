package com.spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.boot.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
