//package com.reportingservice.reporting.producer;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class Producer {
//
//    @Value("${topic.name}")
//    private String TOPIC;
//
//    private final KafkaTemplate<String, User> kafkaTemplate;
//
//    @Autowired
//    public Producer(KafkaTemplate<String, User> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    void sendMessage(User user) {
//        this.kafkaTemplate.send(this.TOPIC, user.getName(), user);
//        log.info(String.format("Produced user -> %s", user));
//    }
//}
