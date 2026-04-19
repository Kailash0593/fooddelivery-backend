package com.food_delivery.users.service;

import com.food_delivery.users.entity.MessageEntity;
import com.food_delivery.users.enums.MessageEnum;
import org.springframework.http.ResponseEntity;

public interface MessageServiceImp {
    ResponseEntity<MessageEntity> getMessage(MessageEnum state, String message);
}
