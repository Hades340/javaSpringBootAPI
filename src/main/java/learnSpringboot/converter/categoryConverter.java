package learnSpringboot.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import learnSpringboot.dto.categoryDTO;
import learnSpringboot.entity.categoryEntity;
@Component
public class categoryConverter {
	@Autowired
	private ModelMapper modelMapper;
	public categoryEntity toEntity(categoryDTO dto) {
		categoryEntity category = modelMapper.map(dto, categoryEntity.class);
		return category;
	}
	public categoryDTO toDTO(categoryEntity entity) {
		categoryDTO category = modelMapper.map(entity, categoryDTO.class);
		return category;
	}
}
