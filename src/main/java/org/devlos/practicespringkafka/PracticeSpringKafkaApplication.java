package org.devlos.practicespringkafka;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class PracticeSpringKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeSpringKafkaApplication.class, args);


    }

    @Bean
    public ApplicationRunner runner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            kafkaTemplate.send("quickstart-events", "test-topic-1");
        };
    }
}
