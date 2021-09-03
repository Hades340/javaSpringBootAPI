package learnSpringboot.dto;

import org.aspectj.weaver.tools.Trace;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class userDTO extends abtractDTO<userDTO>{
	private String username;
	private String password;
}
