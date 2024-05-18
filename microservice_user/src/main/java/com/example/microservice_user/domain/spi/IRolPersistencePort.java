package com.example.microservice_user.domain.spi;

import com.example.microservice_user.domain.model.Rol;

public interface IRolPersistencePort {

        void saveRol(Rol rol);
}
