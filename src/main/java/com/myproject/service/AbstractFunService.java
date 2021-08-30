package com.myproject.service;

import java.util.List;

public abstract class AbstractFunService {

    public Double calculate(final List<Long> ids) {
        final Double result;
        if (ids == null || ids.isEmpty()) {
            result = this.calculateAll();
        } else {
            result = this.calculateByIdList(ids);
        }
        return result;
    }

    public abstract Double calculateAll(); // посчитать по всему списку

    public abstract Double calculateByIdList(List<Long> ids); // посчитать только по избранным элементам

}
