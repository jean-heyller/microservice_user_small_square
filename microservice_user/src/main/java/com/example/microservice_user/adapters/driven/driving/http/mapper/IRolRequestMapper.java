package com.example.microservice_user.adapters.driven.driving.http.mapper;

import com.example.microservice_user.adapters.driven.driving.http.dto.request.AddRolRequest;
import com.example.microservice_user.domain.model.Rol;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IRolRequestMapper {
    @Mapping(target = "id", ignore = true)
    Rol addRequestToRol(AddRolRequest rolRequest);
}
