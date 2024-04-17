package com.example.qmttest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class OE {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String sOeId;

    @ManyToOne
    @JoinColumn(name = "s_ku_id")
    private KU ku;

    @ManyToOne
    @JoinColumn(name = "s_fs_id")
    private FS fs;

    @Column(name = "s_parentoe_l_id")
    private String sParentOELId;

    @Column(name = "s_parentoe_f_id")
    private String sParentOEFId;

    @Column(name = "ps_oeid")
    private Integer psOEID;

    @Column(name = "fs_start")
    private Integer fsStart;

    @Column(name = "gültig_x0020_ab")
    private LocalDateTime gültig_x0020_ab;

    @Column(name = "gültig_x0020_bis")
    private LocalDateTime gültig_x0020_bis;

    private String typ;

    private String konzernunternehmen;

    @Column(name = "führungsstruktur")
    private String führungsstruktur;

    private String orgKz;

    private String orgBez1;

    private String standort;

    private String orgBez2;

    private String firmierung1;

    private String firmierung2;

    private String orgBez3;
}