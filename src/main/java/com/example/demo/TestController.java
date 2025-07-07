package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class TestController {

	@GetMapping("/greet")
	public String greet()
	{
		return "This is Jenkin deployemnet cdoe After 5 min Working or not";
	}
}
