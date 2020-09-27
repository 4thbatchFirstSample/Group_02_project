package com.spring.boot.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.boot.entities.Module;
import com.spring.boot.repositories.ModuleRepository;

@Service
public class ModuleServiceImpliment implements ModuleService {
	@Autowired
	private ModuleRepository moduleRepository;

	@Override
	public void addModule(Module module) {
		moduleRepository.save(module);
	}

	@Override
	public List<Module> getAll() {
		return moduleRepository.findAll();
	}

	@Override
	public void deleteModule(Long id) {
		moduleRepository.deleteById(id);
	}

	@Override
	public Optional<Module> getModuleFromId(Long id) {
		return moduleRepository.findById(id);
	}

	@Override
	public void moduleUpdate(Module module) {
		moduleRepository.save(module);

	}

	@Override
	public List<Module> getAllModuleByProjectId(Long projectId) {
		return moduleRepository.findByProjectId(projectId);
	}

}