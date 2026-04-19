package com.food_delivery.delivery_agents.controller;

import com.food_delivery.delivery_agents.entity.MessageEntity;
import com.food_delivery.delivery_agents.enums.MessageEnum;
import com.food_delivery.delivery_agents.service.MessageService;
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
