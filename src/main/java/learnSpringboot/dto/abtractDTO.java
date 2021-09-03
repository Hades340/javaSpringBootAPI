package learnSpringboot.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public abstract class abtractDTO<T> {
	private Long id;
	private String createBy;
	private String modifyBy;
	private Date createDate;
	private Date modifyDate;
	List<T> list = new ArrayList<T>();
}
