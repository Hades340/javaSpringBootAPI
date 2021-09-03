package learnSpringboot.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class newsDTO extends abtractDTO<newsDTO>{
	private String slug;
	private String news_name;
	private String content;
	private String detail;
	private String thumnail;
	private long category_Code;
}
