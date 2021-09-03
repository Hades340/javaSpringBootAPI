package learnSpringboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import learnSpringboot.dto.categoryDTO;
import learnSpringboot.service.ICategoryService;

@RestController
public class categoryAPI {
	@Autowired
	private ICategoryService category;
	@GetMapping(value = "/category")
	public String getData() {
		return "success";
	}
	@PostMapping(value = "/category")
	public String insertData(@RequestBody categoryDTO dto) {
		String result = "Systems error";
		if(category.save(dto)) {
			result = "Insert category success";
		}
		return result;
	}
	@PutMapping(value = "/category/{id}")
	public String updateData(@RequestBody categoryDTO dto, @PathVariable("id") long id) {
		String result = "Systems error";
		dto.setId(id);
		if(category.save(dto)) {
			result = "Update category success";
		}
		return result;
	}
}
