package learnSpringboot.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.aspectj.weaver.tools.Trace;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name="category")
@EqualsAndHashCode(callSuper = true)
public class categoryEntity extends abtractEntity{
	@Column
	private String contentNews;
	@Column 
	private String slug;
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	Collection<newsEntity> news;
}
