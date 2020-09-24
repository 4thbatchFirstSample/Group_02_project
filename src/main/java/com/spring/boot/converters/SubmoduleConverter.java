package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.spring.boot.dto.submoduleDto;
import com.spring.boot.entities.SubModule;

@Service
public class SubmoduleConverter {
	public static SubModule submoduleDtoToSubmodule(submoduleDto submoduleDto) {
		SubModule Submodule = new SubModule();
		if (submoduleDto != null) {
			Submodule.setId(submoduleDto.getId());
			Submodule.setName(submoduleDto.getName());
			return Submodule;
		}
		return null;
	}

	public static List<submoduleDto> submoduleToSubmoduleDto(List<SubModule> submoduleList) {
		List<submoduleDto> listsubmoduleDto = new ArrayList<>();
		if (submoduleList != null) {
			for (SubModule Submodule : submoduleList) {	
				submoduleDto submoduleDto = new submoduleDto();
				submoduleDto.setId(Submodule.getId());
				submoduleDto.setName(Submodule.getName());
				
				listsubmoduleDto.add(submoduleDto);
			}
			return listsubmoduleDto;
		}
		return null;
}

}
