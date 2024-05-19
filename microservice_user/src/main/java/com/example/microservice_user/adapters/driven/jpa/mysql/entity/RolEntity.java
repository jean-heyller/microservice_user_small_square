package com.example.microservice_user.adapters.driven.jpa.mysql.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rol")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RolEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(length = 50)
        private String name;
        @Column(length = 90)
        private String description;
}
