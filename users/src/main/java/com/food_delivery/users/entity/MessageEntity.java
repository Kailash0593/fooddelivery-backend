package com.food_delivery.users.entity;

import com.food_delivery.users.enums.MessageEnum;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MessageEntity {
    private MessageEnum state;
    private String message;
}
