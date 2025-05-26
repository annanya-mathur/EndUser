package com.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import static com.enduser.config.AppConstant.GROUP_ID;
import static com.enduser.config.AppConstant.LOCATION_TOPIC_NAME;

@Configuration
public class KakfaConsumerConfig {

    @KafkaListener(topics = LOCATION_TOPIC_NAME , groupId = GROUP_ID)
    public void updatedLocation(String location)
    {
             System.out.println(location);
    }
}
