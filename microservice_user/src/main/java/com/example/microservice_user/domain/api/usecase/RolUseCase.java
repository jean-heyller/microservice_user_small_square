package com.example.microservice_user.domain.api.usecase;

import com.example.microservice_user.domain.api.IRolServicePort;
import com.example.microservice_user.domain.model.Rol;
import com.example.microservice_user.domain.spi.IRolPersistencePort;

public class RolUseCase implements IRolServicePort {

    private final IRolPersistencePort rolPersistencePort;

    public RolUseCase(IRolPersistencePort rolPersistencePort) {
        this.rolPersistencePort = rolPersistencePort;
    }

    @Override
    public void saveRol(Rol rol) {
        rolPersistencePort.saveRol(rol);
    }
}
