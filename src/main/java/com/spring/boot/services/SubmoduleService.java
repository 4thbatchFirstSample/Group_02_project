package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import com.spring.boot.entities.SubModule;

public interface SubmoduleService {
	
	public void addSubmodule(SubModule submodule);
	public List<SubModule> getAll();
	
	public void deleteSubmoduleById(Long id);
		
	public void SubmduleUpdate(SubModule submodule);
	
	public Optional<SubModule> GetSubmoduleId(Long id);
	
	public List<SubModule>GetSubmoduleFromModuleId(Long id);

}
