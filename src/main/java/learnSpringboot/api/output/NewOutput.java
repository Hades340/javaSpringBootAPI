package learnSpringboot.api.output;

import java.util.ArrayList;
import java.util.List;

import learnSpringboot.dto.newsDTO;
import lombok.Data;

@Data
public class NewOutput {
	private int totalPage;
	private int page;
	private List<newsDTO> listNews = new ArrayList<newsDTO>();
}
