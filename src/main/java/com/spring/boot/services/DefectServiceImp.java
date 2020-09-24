package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Defect;
import com.spring.boot.repositories.DefectRepository;

@Service
public class DefectServiceImp implements DefectService {
	@Autowired
	private DefectRepository DefectRepository;

	@Override
	public void addDefect(Defect defect) {
		DefectRepository.save(defect);
	}

	@Override
	public List<Defect> getDefect() {
		return DefectRepository.findAll();
	}

	@Override
	public void deteleDefectById(Long id) {
		DefectRepository.deleteById(id);
	}

	@Override
	public List<Defect> getAllDefectsBySubmoduleId(Long SubModuleId) {
		return DefectRepository.findBySubModuleId(SubModuleId);
	}

}
