package com.example.microservice_user.adapters.driven.driving.http.controller;

import com.example.microservice_user.adapters.driven.driving.http.dto.request.AddRolRequest;
import com.example.microservice_user.adapters.driven.driving.http.mapper.IRolRequestMapper;
import com.example.microservice_user.domain.api.IRolServicePort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RequestMapping("/rol")
@RequiredArgsConstructor
@RestController
public class RolRequestControllerAdapter {

    private final IRolRequestMapper rolRequestMapper;
    private final IRolServicePort rolServicePort;

    @PostMapping("/")
    public ResponseEntity<Void> addRol(@Valid @RequestBody AddRolRequest request) {
        rolServicePort.saveRol(rolRequestMapper.addRequestToRol(request));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}