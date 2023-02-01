package com.himani.niet.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@RequestMapping("/")
	public String welcome() {
        return "Welcome to NIET";
    }
}
