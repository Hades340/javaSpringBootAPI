package learnSpringboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learnSpringboot.converter.categoryConverter;
import learnSpringboot.dto.categoryDTO;
import learnSpringboot.entity.categoryEntity;
import learnSpringboot.repository.categoryRepository;
import learnSpringboot.service.ICategoryService;
@Service
public class CategoryService implements ICategoryService{

	@Autowired
	private categoryRepository category;	
	
	@Autowired
	private categoryConverter convert;
	@Override
	public boolean save(categoryDTO dto) {
		boolean result = false;
		try {
			
			categoryEntity categoryEntity = convert.toEntity(dto);
			category.save(categoryEntity);
			result = true;
		} catch (Exception e) {
			e.getMessage();
		}
	
		return result;
	}

}
