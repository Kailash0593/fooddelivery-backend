package com.food_delivery.restaurants.controller;

import com.food_delivery.restaurants.entity.MessageEntity;
import com.food_delivery.restaurants.enums.MessageEnum;
import com.food_delivery.restaurants.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HealthCheckController {

    @Autowired
    MessageService messageService;

    @GetMapping("health-check")
    public ResponseEntity<MessageEntity> checkHealth(){
        return messageService.getMessage(MessageEnum.SUCCESS, "OK");
    }
}
