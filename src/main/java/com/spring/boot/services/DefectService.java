package com.spring.boot.services;
import java.util.List;

import com.spring.boot.entities.Defect;

public interface DefectService {
	public void addDefect (Defect Defect);
	public List<Defect> getDefect();
	public void deteleDefectById(Long id);
	public List<Defect> getAllDefectsBySubmoduleId(Long SubModuleId);
}
