package com.example.microservice_user.domain.api.usecase;

import com.example.microservice_user.domain.model.Rol;
import com.example.microservice_user.domain.spi.IRolPersistencePort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.verify;

class RolUseCaseTest {

    private IRolPersistencePort rolPersistencePort;
    private RolUseCase rolUseCase;

    @BeforeEach
    void setUp() {
        rolPersistencePort = Mockito.mock(IRolPersistencePort.class);
        rolUseCase = new RolUseCase(rolPersistencePort);
    }

    @Test
    void saveRol() {
        Long id = 1L;
        String name = "name";
        String description = "description";
        Rol rol = new Rol(id,name, description);
        rolUseCase.saveRol(rol);

        verify(rolPersistencePort).saveRol(rol);
    }
}