package learnSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import learnSpringboot.entity.categoryEntity;

public interface categoryRepository extends JpaRepository<categoryEntity, Long>{
	
	categoryEntity findOneByid(long id);
}
