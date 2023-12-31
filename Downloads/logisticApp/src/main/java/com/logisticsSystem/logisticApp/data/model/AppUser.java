package com.logisticsSystem.logisticApp.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@RequiredArgsConstructor
@AllArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private final List<OrderK> listOfOrderK = new ArrayList<>();
    private String username;
    private String email;
    private String password;
    private boolean isLogin;
    private LocalDateTime createdDate;
    @Enumerated(EnumType.STRING)
    private AppUserType appUserType;





}
