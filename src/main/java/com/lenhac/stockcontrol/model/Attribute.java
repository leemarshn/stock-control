package com.lenhac.stockcontrol.model;

import jakarta.persistence.*;

@Entity
public class Attribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attribute_id;
    private String attribute_name;
}
