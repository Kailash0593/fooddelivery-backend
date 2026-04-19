package com.food_delivery.users.controller;

import com.food_delivery.users.entity.MessageEntity;
import com.food_delivery.users.enums.MessageEnum;
import com.food_delivery.users.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @Autowired
    MessageService messageService;

    @GetMapping("health-check")
    public ResponseEntity<MessageEntity> checkHealth(){
        return messageService.getMessage(MessageEnum.SUCCESS, "OK");
    }
}
