package com.reportingservice.reporting.producer;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.requests.SaslAuthenticateRequest;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import javax.security.sasl.Sasl;
import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslServer;
import java.util.Map;

import static org.apache.kafka.clients.producer.ProducerConfig.*;

//@Configuration
//public class KafkaConfiguration {
//
//
//
//}
