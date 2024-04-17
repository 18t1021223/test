package com.example.qmttest.api.v1.company.dto.response;

import com.example.qmttest.entity.FS;
import com.example.qmttest.entity.KU;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * DTO for {@link com.example.qmttest.entity.OE}
 */
@Getter
@Setter
public class OEDto {
    private String sOeId;

//    private KU ku;

//    private FS fs;

    private String sParentOELId;
    private String sParentOEFId;
    private Integer psOEID;
    private Integer fsStart;
    private LocalDateTime gültig_x0020_ab;
    private LocalDateTime gültig_x0020_bis;
    private String typ;
    private String konzernunternehmen;
    private String führungsstruktur;
    private String orgKz;
    private String orgBez1;
    private String standort;
    private String orgBez2;
    private String firmierung1;
    private String firmierung2;
    private String orgBez3;
}