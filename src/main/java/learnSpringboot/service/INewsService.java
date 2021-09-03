package learnSpringboot.service;

import learnSpringboot.dto.newsDTO;

public interface INewsService {
	boolean save(newsDTO dto);
	boolean delete(newsDTO dto);
}
