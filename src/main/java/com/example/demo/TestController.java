package com.example.demo;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class TestController {

	@GetMapping("/greet")
	public Map<String, String> greet() {
	    return Map.of(
	        "Name", "Ratan Sir",
	        "Institute", "SathyaTech",
	        "Work", "Java Full Stack Trainer",
	        "Specialization", "Spring Boot, Microservices, DevOps",
	        "Achievement", "Successfully completed Jenkins CI/CD pipeline to AWS EC2",
	        "Qualities", "Persistent, Hands-on, Problem Solver",
	        "Message", "This is Jenkins Deployment Completed Successfully 🎯"
	    );
	}

}
