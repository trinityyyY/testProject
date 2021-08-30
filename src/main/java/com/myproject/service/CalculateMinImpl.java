package com.myproject.service;

import com.myproject.repository.ValueCalculateRepository;

import java.util.List;

public class CalculateMinImpl extends AbstractValueFunService{

    public CalculateMinImpl(final ValueCalculateRepository repository) {
        super(repository);
    }

    @Override
    public Double calculateAll() {
        return this.getRepository().calculateMinAll();
    }

    @Override
    public Double calculateByIdList(List<Long> ids) {
        return this.getRepository().calculateMinByIdList(ids);
    }


}
