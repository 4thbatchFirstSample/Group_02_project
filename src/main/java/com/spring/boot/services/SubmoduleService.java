package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import com.spring.boot.entities.Submodule;

public interface SubmoduleService {
	
	public void addSubmodule(Submodule submodule);
	public List<Submodule> getAll();
	
	public void deleteSubmoduleById(Long id);
		
	public void SubmduleUpdate(Submodule submodule);
	
	public Optional<Submodule> GetSubmoduleId(Long id);

}
