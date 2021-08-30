package com.myproject.entity;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "firsttable")
public class Value {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    private Long id;

    public Long getId() {
        return this.id;
    }

    @Column(name = "value")
    private Integer value;

    public void setValue(final Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

}
