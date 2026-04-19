package com.food_delivery.restaurants.service;

import com.food_delivery.restaurants.entity.MessageEntity;
import com.food_delivery.restaurants.enums.MessageEnum;
import org.springframework.http.ResponseEntity;

public interface MessageServiceImp {
    ResponseEntity<MessageEntity> getMessage(MessageEnum state, String message);
}
