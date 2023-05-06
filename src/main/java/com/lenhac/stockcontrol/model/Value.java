package com.lenhac.stockcontrol.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Value {
    @Id
    private Long value_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="attribute_id")
    private Attribute attribute;
    private String value_name;

}