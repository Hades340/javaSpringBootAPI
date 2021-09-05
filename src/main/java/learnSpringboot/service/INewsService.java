package learnSpringboot.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import learnSpringboot.dto.newsDTO;

public interface INewsService {
	boolean save(newsDTO dto);
	boolean delete(Long[] ids);
	List<newsDTO> findAll(Pageable pageable);
	List<newsDTO> findAll();
	int totalItem();
}
