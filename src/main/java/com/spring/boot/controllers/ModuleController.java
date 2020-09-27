package com.spring.boot.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.converters.ModuleConverter;
import com.spring.boot.dto.ModuleDto;
import com.spring.boot.services.ModuleService;
import com.spring.boot.entities.Module;

@RestController
@RequestMapping(value = "api/v1")
public class ModuleController {

	@Autowired
	private ModuleService moduleService;

	@PostMapping(value = "/module")
	public ResponseEntity<Object> addmodule(@RequestBody ModuleDto moduleDto) {
		moduleService.addModule(ModuleConverter.moduleDtoToModule(moduleDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/module")
	public ResponseEntity<Object> getModule() {
		return new ResponseEntity<Object>(ModuleConverter.moduleToModuleDto(moduleService.getAll()), HttpStatus.OK);
	}

	@DeleteMapping(value = "/module/{id}")
	public ResponseEntity<Object> deleteModule(@PathVariable Long id) {
		moduleService.deleteModule(id);
		return new ResponseEntity<Object>("Deleted", HttpStatus.OK);
	}

	@GetMapping(value = "/module/{id}")
	public Module getModuleFromId(@PathVariable Long id) {
		Optional<Module> module = moduleService.getModuleFromId(id);
		if (module.isPresent()) {
			return module.get();
		} else {
			throw new RuntimeException("Not found this id !");
		}
	}

	@PutMapping(value = "/module")
	public ResponseEntity<Object> moduleUpdate(@RequestBody ModuleDto moduleDto) {
		moduleService.moduleUpdate(ModuleConverter.moduleDtoToModule(moduleDto));
		return new ResponseEntity<Object>("Update Successfully", HttpStatus.OK);
	}
	
	@GetMapping(value="/projectm/{id}")
	public ResponseEntity<Object> getAllByprojectId(@PathVariable Long id){
		return new ResponseEntity<Object>(ModuleConverter.moduleToModuleDto(moduleService.getAllModuleByProjectId(id)), HttpStatus.OK);
	}

}
