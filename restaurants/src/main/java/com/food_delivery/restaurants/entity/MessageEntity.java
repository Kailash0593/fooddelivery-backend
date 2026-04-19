package com.food_delivery.restaurants.entity;

import com.food_delivery.restaurants.enums.MessageEnum;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MessageEntity {
    private MessageEnum state;
    private String message;
}
