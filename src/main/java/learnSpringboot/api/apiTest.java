package learnSpringboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import learnSpringboot.dto.newsDTO;
import learnSpringboot.service.INewsService;

@RestController
public class apiTest {
	@Autowired
	private INewsService newservice;
	@GetMapping("/")
	public String getdata() {
		return "success";
	}
	
	@PostMapping(value = "/news")
	public String insertNews(@RequestBody newsDTO dto) {
		String result = "Insert Data fail";
		if(newservice.save(dto)) {
			result = "Insert data sucess";
		}
		return result;
	}
	@PutMapping(value="/news/{id}")
	public String updateNews(@RequestBody newsDTO dto, @PathVariable("id") long id) {
		return "success";
	}
	@DeleteMapping(value = "/news")
	public String deleteNews(@RequestBody Long[] ids)
	{
		String result = "Delete item fault";
		if(newservice.delete(ids)) {
			result = "Delete item is success";
		}
		return result;
	}
}
