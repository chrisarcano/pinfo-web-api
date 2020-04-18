package com.cda.pinfo.function.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.DatabaseClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.cda.pinfo.dto.UserDTO;
import com.cda.pinfo.function.repo.UserRepository;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class UserHandler {

    @Autowired
    UserRepository userRepository;
    
    @Autowired
    DatabaseClient dbClient;

    public Mono<ServerResponse> readUsers(ServerRequest serverRequest){
        return ServerResponse
        		.ok()
        		.contentType(MediaType.APPLICATION_JSON)
        		.body(BodyInserters.fromPublisher(dbClient.select().from(UserDTO.class).fetch().all(), UserDTO.class));
    }

    public Mono<ServerResponse> createUser(ServerRequest serverRequest){
    	return ServerResponse.ok().body(userRepository.saveAll(serverRequest.bodyToMono(UserDTO.class)), UserDTO.class);
    }
    
}