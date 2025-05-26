package com.enduser.config;

import org.springframework.kafka.annotation.KafkaListener;

import static com.enduser.config.AppConstant.GROUP_ID;
import static com.enduser.config.AppConstant.LOCATION_TOPIC_NAME;

public class KakfaConsumerConfig {

    @KafkaListener(topics = LOCATION_TOPIC_NAME , groupId = GROUP_ID)
    public void updatedLocation(String location)
    {

    }
}
