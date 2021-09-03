package learnSpringboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import learnSpringboot.dto.categoryDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="news")
@Data
@EqualsAndHashCode(callSuper = true)

public class newsEntity extends abtractEntity{
	@Column
	private String slug;
	@Column
	private String news_name;
	@Column
	private String content;
	@Column
	private String detail;
	@Column
	private String thumnail;
	@ManyToOne
	@JoinColumn(name="category_id")
	@ToString.Exclude
	private categoryEntity category;
}
