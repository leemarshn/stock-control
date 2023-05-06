package com.lenhac.stockcontrol.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.Fetch;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class SubCategory {
    @Id
    private Long subCategory_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="category_id")
    private MainCategory mainCategory;
    private String subCategory_name;
}
