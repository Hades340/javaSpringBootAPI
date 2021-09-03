package learnSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import learnSpringboot.entity.userEntity;

public interface userRepository extends JpaRepository<userEntity, Long>{

}
