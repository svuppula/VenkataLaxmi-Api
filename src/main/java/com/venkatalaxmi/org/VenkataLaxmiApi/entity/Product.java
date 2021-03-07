package com.venkatalaxmi.org.VenkataLaxmiApi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "product_name", nullable = false)
    String name;

    @Column(name = "product_quality", nullable = false)
    String quality;

    @Column(name = "product_type", nullable = false)
    String type;

    @Column(name = "product_mfg_date", nullable = false)
    String mfgDate;

    @Column(name = "product_expr_date", nullable = false)
    String exprDate;
}
