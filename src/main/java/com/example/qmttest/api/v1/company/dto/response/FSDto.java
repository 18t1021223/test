package com.example.qmttest.api.v1.company.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * DTO for {@link com.example.qmttest.entity.FS}
 */
@Getter
@Setter
public class FSDto {
    private String sNodeFsId;
    private Integer depth;
    private LocalDateTime gab;
    private LocalDateTime gbis;
    private String fsKurz;
    private String fslang;
    private String sNodeParentId;
}