package com.myproject.service;

import com.myproject.repository.ValueCalculateRepository;

import java.util.List;

public class CalculateAvgImpl extends AbstractValueFunService {

    public CalculateAvgImpl(final ValueCalculateRepository repository) {
        super(repository);
    }

    @Override
    public Double calculateAll() {
        return this.getRepository().calculateAvgAll();
    }

    @Override
    public Double calculateByIdList(List<Long> ids) {
        return this.getRepository().calculateAvgByIdList(ids);
    }

}
