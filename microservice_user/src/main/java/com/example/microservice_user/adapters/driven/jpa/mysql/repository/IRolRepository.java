package com.example.microservice_user.adapters.driven.jpa.mysql.repository;

import com.example.microservice_user.adapters.driven.jpa.mysql.entity.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRolRepository extends JpaRepository<RolEntity, Long> {
    Optional<RolEntity> findById(Long id);

    Optional<RolEntity> findByName(String name);
}
