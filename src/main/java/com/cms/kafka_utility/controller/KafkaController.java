package com.cms.kafka_utility.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/kafka")
public class KafkaController {
	
	@GetMapping
	public String getHelloWorld() {
		return "Hello Kafka World!";
	}
	
	@RequestMapping(path = "/responsentity")
	public ResponseEntity<String> getHelloWorldResponseEntity(){
		return new ResponseEntity<>("Hello Kafka World! ResponseEntity", HttpStatus.OK);
		
	}

}
