package com.cda.pinfo.function.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.cda.pinfo.dto.UserDTO;

public interface UserRepository extends ReactiveCrudRepository<UserDTO, Integer> {}
