package com.spring.boot.controllers;

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

import com.spring.boot.converters.SubmoduleConverter;
import com.spring.boot.dto.submoduleDto;
import com.spring.boot.services.SubmoduleService;

@RestController
@RequestMapping(value ="api/v1")
public class SubmoduleController {
	
	@Autowired
	private SubmoduleService submoduleservice;
	
	@PostMapping(value="/submodule")
	public ResponseEntity<Object> addsubmodule (@RequestBody submoduleDto submoduleDto){
		submoduleservice.addSubmodule(SubmoduleConverter.submoduleDtoToSubmodule(submoduleDto));
		return new ResponseEntity<Object>("Added successfully", HttpStatus.CREATED);
	}
	
	@GetMapping(value="/submodule")
	public ResponseEntity<Object>getSubmodule() {
		return new ResponseEntity<Object>(SubmoduleConverter.submoduleToSubmoduleDto(submoduleservice.getAll()),HttpStatus.OK);
	
	}
	
	@DeleteMapping(value = "/submodule/{id}")
    public ResponseEntity<Object> deleteSubmodule(@PathVariable Long id) {
		submoduleservice.deleteSubmoduleById(id);
        return new ResponseEntity<Object>("Delete Successfully",HttpStatus.OK);
	}
	
	@PutMapping(value = "/submodule")
	public ResponseEntity<Object>updateSubmodule(@RequestBody submoduleDto submoduleDto){
		submoduleservice.SubmduleUpdate(SubmoduleConverter.submoduleDtoToSubmodule(submoduleDto));
		return new ResponseEntity<Object>("Updated Successfully",HttpStatus.OK);
	}
	
	@GetMapping(value = "/submodule/{id}")
	public ResponseEntity<Object>getbyid(@PathVariable Long id){
		return new ResponseEntity<Object>(submoduleservice.GetSubmoduleId(id),HttpStatus.OK);
	}
	

	}
	
