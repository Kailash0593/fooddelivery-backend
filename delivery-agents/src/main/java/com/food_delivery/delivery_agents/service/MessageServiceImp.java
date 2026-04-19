package com.food_delivery.delivery_agents.service;

import com.food_delivery.delivery_agents.entity.MessageEntity;
import com.food_delivery.delivery_agents.enums.MessageEnum;
import org.springframework.http.ResponseEntity;

public interface MessageServiceImp {
    ResponseEntity<MessageEntity> getMessage(MessageEnum state, String message);
}
