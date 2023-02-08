package com.live.kafka.CinemaConsumer.consumer;

import com.live.kafka.CinemaConsumer.dto.CinemaDTO;
import com.live.kafka.CinemaConsumer.service.CinemaService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class CinemaConsumer {

    private static final Logger log = LoggerFactory.getLogger(CinemaConsumer.class);

    @Autowired
    private CinemaService service;

    @Value(value = "${topic.name}")
    private String topic;

    @Value(value = "${spring.kafka.group-id}")
    private String group;

    @KafkaListener(topics = "${topic.name}", groupId = "${spring.kafka.group-id}", containerFactory = "cinemaKafkaListenerContainerFactory")
    public void listenTopicCinema(ConsumerRecord<String, CinemaDTO> record){
        log.info("received message: " + record.value());
    }
}
