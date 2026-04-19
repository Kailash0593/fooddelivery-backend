package com.food_delivery.delivery_agents.service;

import com.food_delivery.delivery_agents.entity.MessageEntity;
import com.food_delivery.delivery_agents.enums.MessageEnum;
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
