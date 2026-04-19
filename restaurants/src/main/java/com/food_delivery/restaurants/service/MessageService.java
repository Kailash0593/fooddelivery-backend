package com.food_delivery.restaurants.service;

import com.food_delivery.restaurants.entity.MessageEntity;
import com.food_delivery.restaurants.enums.MessageEnum;
import com.food_delivery.restaurants.service.MessageServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MessageService implements  MessageServiceImp {

    public ResponseEntity<MessageEntity> getMessage(MessageEnum state, String message){
        MessageEntity m = MessageEntity.builder().state(state).message(message).build();
        return new ResponseEntity<>(m, HttpStatus.OK);
    }
}
