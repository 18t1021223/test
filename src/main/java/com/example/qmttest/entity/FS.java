package com.example.qmttest.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class FS {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String sNodeFsId;

    @Column(nullable = false)
    private Integer depth;

    private LocalDateTime gab;

    private LocalDateTime gbis;

    private String fsKurz;

    private String fslang;

    private String sNodeParentId;
}
