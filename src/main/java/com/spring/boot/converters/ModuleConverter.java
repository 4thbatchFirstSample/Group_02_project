package com.spring.boot.converters;

	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.stereotype.Service;

	import com.spring.boot.dto.ModuleDto;
	import com.spring.boot.entities.Module;

	@Service
	public class ModuleConverter {
		// projectDto to Project Entity Converter
		
		public static Module moduleDtoToModule(ModuleDto moduleDto) {
			Module Module = new Module();
			if (moduleDto != null) {
				Module.setId(moduleDto.getId());
				Module.setName(moduleDto.getName());
				Module.setProjectId(moduleDto.getProjectId());
				return Module;
			}
			return null;
		}

		// Project to ProjectDto list converter

		public static List<ModuleDto> moduleToModuleDto(List<Module> moduleList) {
			List<ModuleDto> listModuleDto = new ArrayList<>();
			if (moduleList != null) {
				for (Module module : moduleList) {
					ModuleDto moduleDto = new ModuleDto();
					moduleDto.setId(module.getId());
					moduleDto.setName(module.getName());
					moduleDto.setProjectId(module.getProjectId());

					listModuleDto.add(moduleDto);
				}
				return listModuleDto;
			}
			return null;

		}

}
