package com.example.qmttest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class KU {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String sNodeKuId;

    @Column(nullable = false)
    private Integer depth;

    private LocalDateTime gab;

    private LocalDateTime gbis;

    private String kulang;

    private String sNodeParentId;
}