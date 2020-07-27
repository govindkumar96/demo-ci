package com.example.democi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCiController {
	
	@GetMapping(value="/ci/test")
	public String testCi() {
		return "Hello From Ci Controller";
	}

}
