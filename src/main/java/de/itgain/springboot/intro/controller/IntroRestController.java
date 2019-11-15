package de.itgain.springboot.intro.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/intro")
@PropertySource("classpath:intro.properties")
public class IntroRestController {

	private static final Logger log = LoggerFactory.getLogger(IntroRestController.class);

	@Value("${greeting.text}")
	private String greetingText;

	@GetMapping("/hello/{name}")
	public ResponseEntity<String> hello(@PathVariable String name) {
		log.info("Received hello from {}", name);

		return new ResponseEntity<>(greetingText + name, HttpStatus.OK);
	}

}
