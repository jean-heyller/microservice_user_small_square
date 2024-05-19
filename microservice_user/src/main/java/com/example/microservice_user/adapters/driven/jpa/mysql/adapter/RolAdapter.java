package com.example.microservice_user.adapters.driven.jpa.mysql.adapter;

import com.example.microservice_user.adapters.driven.jpa.mysql.exceptions.ValueAlreadyExitsException;
import com.example.microservice_user.adapters.driven.jpa.mysql.mapper.IRolEntityMapper;
import com.example.microservice_user.adapters.driven.jpa.mysql.repository.IRolRepository;
import com.example.microservice_user.domain.model.Rol;
import com.example.microservice_user.domain.spi.IRolPersistencePort;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class RolAdapter implements IRolPersistencePort {

    private static final String ROL_ALREADY_EXISTS = "the Rol";

    private final IRolRepository rolRepository;
    private final IRolEntityMapper rolEntityMapper;

    @Override
    public void saveRol(Rol rol) {
        String normalizedRolName = rol.getName().toLowerCase();
        if(rolRepository.findByName(normalizedRolName).isPresent()){
            throw new ValueAlreadyExitsException(ROL_ALREADY_EXISTS);
        }

        rol.setName(normalizedRolName);

        rolRepository.save(rolEntityMapper.toEntity(rol));

    }


}
