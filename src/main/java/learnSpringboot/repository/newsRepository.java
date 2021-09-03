package learnSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import learnSpringboot.entity.newsEntity;

public interface newsRepository extends JpaRepository<newsEntity, Long>{

}
