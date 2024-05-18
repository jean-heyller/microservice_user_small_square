package com.example.microservice_user.domain.model;

public class Rol {
    Long id;
    String rolName;
    String description;

    public Rol(Long id, String rolName, String description) {
        this.id = id;
        this.rolName = rolName;
        this.description = description;
    }
}
