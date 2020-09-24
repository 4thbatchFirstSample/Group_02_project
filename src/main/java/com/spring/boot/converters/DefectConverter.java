package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.spring.boot.dto.DefectDto;
import com.spring.boot.entities.Defect;
import com.spring.boot.entities.SubModule;

@Service
public class DefectConverter {
	//DefectDto to Defect converter
	public static Defect DefectDtoToDefect(DefectDto DefectDto) {
		Defect defect = new Defect();
		SubModule Submodule = new SubModule();
		if (DefectDto != null) {
			defect.setId(DefectDto.getId());
			defect.setName(DefectDto.getName());
			defect.setStatus(DefectDto.getStatus());
			defect.setType(DefectDto.getType());
			defect.setAction(DefectDto.getAction());
			defect.setAssignto(DefectDto.getAssignto());
			defect.setDescription(DefectDto.getDescription());
			defect.setEnteredby(DefectDto.getEnteredby());
			defect.setSeverity(DefectDto.getSeverity());
			defect.setPriority(DefectDto.getPriority());
			Submodule.setId(DefectDto.getSubModuleId());
			defect.setSubModule(Submodule);
			
			return defect;
		}
		return null;
	}
	
	// Defect to DefectDto list converter

			public static List<DefectDto> defectToDefectDto(List<Defect> defectList) {
				List<DefectDto> listDefecttDto = new ArrayList<>();
				if (defectList != null) {
					for (Defect defect : defectList) {
						DefectDto defectDto = new DefectDto();
						defectDto.setId(defect.getId());
						defectDto.setName(defect.getName());
						defectDto.setStatus(defect.getStatus());
						defectDto.setType(defect.getType());
						defectDto.setAction(defect.getAction());
						defectDto.setAssignto(defect.getAssignto());
						defectDto.setDescription(defect.getDescription());
						defectDto.setEnteredby(defect.getEnteredby());
						defectDto.setSeverity(defect.getSeverity());
						defectDto.setPriority(defect.getPriority());
						defectDto.setSubModuleId(defect.getSubModule().getId());
						listDefecttDto.add(defectDto);
					}
					return listDefecttDto;
				}
				return null;

			}
}

