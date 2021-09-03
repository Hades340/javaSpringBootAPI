package learnSpringboot.converter;

import org.springframework.stereotype.Component;

import learnSpringboot.dto.newsDTO;
import learnSpringboot.entity.newsEntity;

@Component
public class newsConverter  {
	public newsDTO toDTO(newsEntity entity) {
		newsDTO news = new newsDTO(); 
		news.setContent(entity.getContent());
		news.setDetail(entity.getDetail());
		news.setNews_name(entity.getNews_name());
		news.setSlug(entity.getSlug());
		news.setThumnail(entity.getThumnail());
		return news;
	}
	public newsEntity toEntity(newsDTO dto) {
		newsEntity news = new newsEntity();
		news.setContent(dto.getContent());
		news.setDetail(dto.getDetail());
		news.setNews_name(dto.getNews_name());
		news.setSlug(dto.getSlug());
		news.setThumnail(dto.getThumnail());
		return news;
	}
	
}
