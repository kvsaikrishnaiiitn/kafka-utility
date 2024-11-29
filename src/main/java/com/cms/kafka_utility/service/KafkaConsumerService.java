package com.cms.kafka_utility.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
	
	private Logger LOGGER = LoggerFactory.getLogger(getClass());
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	@KafkaListener(topics = "${kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
	public void receiveEvent(ConsumerRecord<String, String> record) {
		LOGGER.info("KafkaConsumerService.receiveEvent()...");
		System.out.println("KafkaConsumerService.receiveEvent()...event:" + record.value());
		LOGGER.info("KafkaConsumerService.receiveEvent()...is completed.");
	}

}
