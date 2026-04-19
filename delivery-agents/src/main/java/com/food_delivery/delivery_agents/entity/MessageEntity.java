package com.food_delivery.delivery_agents.entity;

import com.food_delivery.delivery_agents.enums.MessageEnum;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MessageEntity {
    private MessageEnum state;
    private String message;
}
