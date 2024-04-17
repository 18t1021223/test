package com.example.qmttest.api.v1.company.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.example.qmttest.entity.KU}
 */
@Getter
@Setter
public class KUDto implements Serializable {
    private String sNodeKuId;
    private Integer depth;
    private LocalDateTime gab;
    private LocalDateTime gbis;
    private String kulang;
    private String sNodeParentId;
}