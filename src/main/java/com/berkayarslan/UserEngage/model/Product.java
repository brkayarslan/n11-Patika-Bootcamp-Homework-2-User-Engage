package com.berkayarslan.UserEngage.model;

import com.berkayarslan.UserEngage.general.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "PRODUCT")
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME",nullable = false)
    private String name;

    @Column(name = "PRICE",nullable = false)
    private double price;

    @Column(name = "EXPIRATION_DATE",nullable = false)
    private LocalDateTime expirationDate;

    @Column(name = "DESCRIPTION",columnDefinition = "TEXT")
    private String description;

    @Column(name = "CATEGORY_ID",nullable = false)
    private int categoryId;

    @Column(name = "STATUS",nullable = false)
    private Status status;
}