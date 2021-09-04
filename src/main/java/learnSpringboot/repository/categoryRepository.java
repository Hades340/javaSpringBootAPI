package learnSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import learnSpringboot.entity.categoryEntity;

public interface categoryRepository extends JpaRepository<categoryEntity, Long>{
	@Query(value="select * from category c where c.id = :id",nativeQuery = true)
	categoryEntity findOneByid(@Param("id")Long id);
}
