package learnSpringboot.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import learnSpringboot.dto.newsDTO;

@RestController
public class apiTest {
	
	@GetMapping("/")
	public String getdata() {
		return "success";
	}
	
	@PostMapping(value = "/news")
	public String insertNews(@RequestBody newsDTO dto) {
		return "success";
	}
	@PutMapping(value="/news/{id}")
	public String updateNews(@RequestBody newsDTO dto, @PathVariable("id") long id) {
		return "success";
	}
}
