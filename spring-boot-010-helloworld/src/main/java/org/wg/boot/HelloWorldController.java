package org.wg.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/")
	public String index() {
		System.out.println("Hello Spring Boot!");
		return "Hello Spring Boot";
	}
}
