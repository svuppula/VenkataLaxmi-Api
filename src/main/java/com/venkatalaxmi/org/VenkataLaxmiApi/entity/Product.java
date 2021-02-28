package com.venkatalaxmi.org.VenkataLaxmiApi.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue
    Long id;

    @NotNull
    @Column(name = "product_name")
    String name;

    @NotNull
    @Column(name = "product_quality")
    String quality;

    @NotNull
    @Column(name = "product_type")
    String type;

    @NotNull
    @Column(name = "product_mfg_date")
    String mfgDate;

    @NotNull
    @Column(name = "product_expr_date")
    String exprDate;
}
