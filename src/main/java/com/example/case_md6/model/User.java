package com.example.case_md6.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //người dùng
    private Integer id;
    private String name;
    private String userName;
    private String phone;
    private String email;
    private String password;
    private String img;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;



}
