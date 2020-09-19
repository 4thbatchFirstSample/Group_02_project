package com.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.boot.converters.DefectConverter;
import com.spring.boot.dto.DefectDto;
import com.spring.boot.services.DefectService;

@RestController
@RequestMapping(value = "api/v1")
public class DefectControler {
	@Autowired
	private DefectService DefectService;
	
	@PostMapping(value = "/Defect")
	public ResponseEntity<Object> addDefect(@RequestBody DefectDto defectDto){
		DefectService.addDefect(DefectConverter.DefectDtoToDefect(defectDto));
		return new ResponseEntity<Object>("Added Successfully",HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/Defect")
	public ResponseEntity<Object> getDefect(){
		return new ResponseEntity<Object>(DefectConverter.defectToDefectDto(DefectService.getDefect()),HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/Defect/{id}")
	public ResponseEntity<Object> deleteDefectById(@PathVariable Long id){
		DefectService.deteleDefectById(id);
		return new ResponseEntity<Object>("Successfully Deleted",HttpStatus.OK);
	}
	

}
