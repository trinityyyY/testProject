package com.myproject.service;

import com.myproject.repository.ValueCalculateRepository;

import java.util.List;

public class CalculateSumImpl extends AbstractValueFunService{

    public CalculateSumImpl(final ValueCalculateRepository repository) {
        super(repository);
    }

    @Override
    public Double calculateAll() {
        return this.getRepository().calculateSumAll();
    }

    @Override
    public Double calculateByIdList(List<Long> ids) {
        return this.getRepository().calculateSumByListId(ids);
    }


}
