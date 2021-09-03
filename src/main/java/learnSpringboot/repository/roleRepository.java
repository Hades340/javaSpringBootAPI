package learnSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import learnSpringboot.entity.roleEntity;

public interface roleRepository extends JpaRepository<roleEntity, Long>{

}
