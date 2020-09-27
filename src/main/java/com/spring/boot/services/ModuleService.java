package com.spring.boot.services;

import java.util.List;
import java.util.Optional;
import com.spring.boot.entities.Module;

public interface ModuleService {

	public void addModule(Module module);

	public List<Module> getAll();

	public void deleteModule(Long id);

	public Optional<Module> getModuleFromId(Long id);

	public void moduleUpdate(Module module);
	
	public List<Module> getAllModuleByProjectId(Long projectId);
}
