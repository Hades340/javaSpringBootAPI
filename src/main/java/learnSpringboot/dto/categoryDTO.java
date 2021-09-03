package learnSpringboot.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class categoryDTO extends abtractDTO<categoryDTO>{
	private String contentNews;
	private String slug;
}
