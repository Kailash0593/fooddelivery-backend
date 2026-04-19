package com.food_delivery.api_gateway.routes;

import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class Routes {

//    @Bean
//    public RouterFunction<ServerResponse> userServiceRoute() {
//        return GatewayRouterFunctions.route("user_service")
//            .route(
//                    RequestPredicates.path("/api/users/**"),
//                    HandlerFunctions.http()
//            )
//            .filter((request, next) -> {
//                request.attributes().put("org.springframework.cloud.gateway.server.mvc.uri",
//                        "http://localhost:8082");
//                return next.handle(request);
//            })
//            .build();
//    }
}