package com.example.microservice_user.adapters.driven.driving.http.dto.request;

import com.example.microservice_user.adapters.driven.driving.http.util.AdapterConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;



@AllArgsConstructor
@Getter
public class AddRolRequest {

    @NotBlank(message = AdapterConstants.FIELD_NAME_NULL_MESSAGE)
    private final String name;

    @NotBlank(message = AdapterConstants.FIELD_DESCRIPTION_NULL_MESSAGE)
    private final String description;



}
