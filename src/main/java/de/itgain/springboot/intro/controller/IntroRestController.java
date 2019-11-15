package de.itgain.springboot.intro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/intro")
public class IntroRestController {

	@GetMapping("/hello/{name}")
	public ResponseEntity<String> hello(@PathVariable String name) {
		return new ResponseEntity<>("Hello " + name + ".", HttpStatus.OK);
	}

}
