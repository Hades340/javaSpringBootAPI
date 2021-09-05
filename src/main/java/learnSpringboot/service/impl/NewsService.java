package learnSpringboot.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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
			 newsEntity.setCategory(categorsy); 
			 newRepo.save(newsEntity);
			 result = true;
		} catch (Exception e) {
			e.getMessage();
		}
		return result;
	}

	@Override
	public boolean delete(Long[] ids) {
		boolean result = false;
		try {
			for (long item : ids) {
				newRepo.deleteById(item);
			}
			result= true;
		} catch (Exception e) {
			e.getMessage();
		}
		return result;
	}

	@Override
	public List<newsDTO> findAll(Pageable pageable) {
		List<newsEntity> newsEntities = newRepo.findAll(pageable).getContent();
		List<newsDTO> listNews = new ArrayList<newsDTO>();
		for (newsEntity item : newsEntities) {
			listNews.add(conver.toDTO(item));
		}
		return listNews;
	}

	@Override
	public int totalItem() {
		return (int) newRepo.count();
	}

	@Override
	public List<newsDTO> findAll() {
		List<newsEntity> newsEntities = newRepo.findAll();
		List<newsDTO> listNews = new ArrayList<newsDTO>();
		for (newsEntity item : newsEntities) {
			listNews.add(conver.toDTO(item));
		}
		return listNews;
	}

}
