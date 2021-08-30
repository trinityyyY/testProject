package com.myproject.service;

import com.myproject.repository.ValueCalculateRepository;

public abstract class AbstractValueFunService extends AbstractFunService {

    private final ValueCalculateRepository repository;

    public AbstractValueFunService(final ValueCalculateRepository repository) {
        this.repository = repository;
    }

    protected ValueCalculateRepository getRepository() {
        return this.repository;
    }

}
