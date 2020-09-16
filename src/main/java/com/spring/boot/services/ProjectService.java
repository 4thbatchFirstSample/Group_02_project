package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.Project;

public interface ProjectService {
	public List<Project> getAll();
	
	public void addProject(Project project);
	
	public void deleteProject(Long id);
	
}
