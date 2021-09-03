package learnSpringboot.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import learnSpringboot.dto.categoryDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name="role")
@Data// auto generate get set 
@EqualsAndHashCode(callSuper = true)
public class roleEntity extends abtractEntity{
	@Column
	private String name;
	@Column 
	private String code;
	@ManyToMany(mappedBy = "role")
	private Collection<userEntity> user;
	
}
