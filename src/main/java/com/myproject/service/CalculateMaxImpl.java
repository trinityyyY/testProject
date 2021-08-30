package com.myproject.service;

import com.myproject.repository.ValueCalculateRepository;

import java.util.List;

public class CalculateMaxImpl extends AbstractValueFunService{

    public CalculateMaxImpl(final ValueCalculateRepository repository) {
        super(repository);
    }

    @Override
    public Double calculateAll() {
        return this.getRepository().calculateMaxAll();
    }

    @Override
    public Double calculateByIdList(List<Long> ids) {
        return this.getRepository().calculateMaxByIdList(ids);
    }

}
