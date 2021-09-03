package learnSpringboot.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class roleDTO extends abtractDTO<roleDTO>{
	private String name;
	private String code;
	
}
