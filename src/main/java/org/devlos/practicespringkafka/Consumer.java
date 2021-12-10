package org.devlos.practicespringkafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @KafkaListener(id = "devlos", topics = "test-topic-1")
    public void listen(String message) {
        System.out.println("=======");
        System.out.println(message);
        System.out.println("=======");
    }
}
