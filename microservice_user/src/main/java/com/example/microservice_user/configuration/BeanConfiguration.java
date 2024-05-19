package com.example.microservice_user.configuration;

import com.example.microservice_user.adapters.driven.jpa.mysql.adapter.RolAdapter;
import com.example.microservice_user.adapters.driven.jpa.mysql.mapper.IRolEntityMapper;
import com.example.microservice_user.adapters.driven.jpa.mysql.repository.IRolRepository;
import com.example.microservice_user.domain.api.usecase.RolUseCase;
import com.example.microservice_user.domain.spi.IRolPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IRolRepository rolRepository;

    private final IRolEntityMapper rolEntityMapper;

    @Bean
    public IRolPersistencePort rolPersistencePort(){
        return new RolAdapter(rolRepository,rolEntityMapper);
    }

    @Bean
    public RolUseCase rolUseCase(){
        return new RolUseCase(rolPersistencePort());
    }

}
