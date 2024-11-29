package com.cms.kafka_utility.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
	
	private Logger LOGGER = LoggerFactory.getLogger(getClass());
	
	@Value("${kafka.topic.name:kafka-utility}")
	String kafkaTopicName;
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendEvent(String event) {
		LOGGER.info("KafkaProducerService.sendEvent()...event:" + event);
		kafkaTemplate.send(kafkaTopicName, event);
		LOGGER.info("KafkaProducerService.sendEvent()...is completed.");
	}

}
