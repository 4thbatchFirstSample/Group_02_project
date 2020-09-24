package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.spring.boot.dto.submoduleDto;
import com.spring.boot.entities.Submodule;

@Service
public class SubmoduleConverter {
	public static Submodule submoduleDtoToSubmodule(submoduleDto submoduleDto) {
		Submodule Submodule = new Submodule();
		if (submoduleDto != null) {
			Submodule.setId(submoduleDto.getId());
			Submodule.setName(submoduleDto.getName());
			return Submodule;
		}
		return null;
	}

	public static List<submoduleDto> submoduleToSubmoduleDto(List<Submodule> submoduleList) {
		List<submoduleDto> listsubmoduleDto = new ArrayList<>();
		if (submoduleList != null) {
			for (Submodule Submodule : submoduleList) {	
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
