package learnSpringboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learnSpringboot.converter.newsConverter;
import learnSpringboot.dto.newsDTO;
import learnSpringboot.entity.categoryEntity;
import learnSpringboot.entity.newsEntity;
import learnSpringboot.repository.categoryRepository;
import learnSpringboot.repository.newsRepository;
import learnSpringboot.service.INewsService;

@Service
public class NewsService implements INewsService{

	@Autowired
	private categoryRepository category;
	@Autowired
	private newsRepository newRepo;
	@Autowired
	private newsConverter conver;
	@Override
	public boolean save(newsDTO dto) {
		boolean result = false;
		try {
			 categoryEntity categorsy = category.findOneByid(dto.getCategory_Code());
			 newsEntity newsEntity = conver.toEntity(dto);
			 newsEntity.setCategory(categorsy); newRepo.save(newsEntity);
			 
		} catch (Exception e) {
			e.getMessage();
		}
		return result;
	}

	@Override
	public boolean delete(newsDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

}
