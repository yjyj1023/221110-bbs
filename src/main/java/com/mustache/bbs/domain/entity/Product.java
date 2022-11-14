package com.mustache.bbs.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "product")
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String price;

    @Column(nullable = false)
    private String stock;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;


}
