package com.cms.kafka_utility.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.kafka_utility.service.KafkaProducerService;

@RestController
@RequestMapping("/kafka/producer")
public class KafkaProducerController {
	
	@Autowired
	private KafkaProducerService kafkaProducerService;
	
	@PostMapping("/send")
	public void sendEvent(@RequestBody String event) {
		kafkaProducerService.sendEvent(event);
	}
	
	@GetMapping
	public String getHelloWorld() {
		return "Hello Kafka Producer World!";
	}

}
