package com.cda.pinfo.function.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.cda.pinfo.function.handler.UserHandler;

@Configuration
public class UserRouter {

    @Bean
    public RouterFunction<ServerResponse> route(UserHandler userHandler){
        return RouterFunctions
                .route(RequestPredicates.GET("/api/v1.0/users").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), userHandler::readUsers)
                .andRoute(RequestPredicates.POST("/api/v1.0/users").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), userHandler::createUser);
    }
}
