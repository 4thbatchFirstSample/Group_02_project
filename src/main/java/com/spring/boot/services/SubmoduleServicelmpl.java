package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.boot.entities.Submodule;
import com.spring.boot.repositories.SubmoduleRepositories;
@Service
public class SubmoduleServicelmpl implements SubmoduleService {
	@Autowired
	 private SubmoduleRepositories  submodulerepositories;

	@Override
	public void addSubmodule(Submodule submodule) {
		submodulerepositories.save(submodule);
	}

	@Override
	public List<Submodule> getAll() {
		return submodulerepositories.findAll();
	}
	@Override
	public void SubmduleUpdate(Submodule submodule) {
		submodulerepositories.save(submodule);	
	}

	@Override
	public void deleteSubmoduleById(Long id) {
		submodulerepositories.deleteById(id);
	}

	@Override
	public Optional<Submodule> GetSubmoduleId(Long id) {
		return submodulerepositories.findById(id) ;
	}


	
}