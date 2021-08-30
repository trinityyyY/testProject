package com.myproject.service;

import com.myproject.dto.ValueDTO;
import com.myproject.entity.Value;
import com.myproject.repository.ValueCalculateRepository;
import com.myproject.repository.ValueCrudRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceImpl implements MyService {

    private final ValueCrudRepository repository;

    private Map<String, AbstractValueFunService> functions;

    public ServiceImpl(final ValueCrudRepository repository) {
        this.repository = repository;
        this.functions = new HashMap<>();
    }

    public void setFunctions(final Map<String, AbstractValueFunService> funs) {
        this.functions = funs;
    }

    @Override
    public Value create(ValueDTO dto) {
        final Value val = new Value();
        val.setValue(dto.getValue());
        return this.repository.save(val);
    }

    @Override
    public Double calculate(String fun, List<Long> ids) {
        return this.functions.get(fun).calculate(ids);
    }
}
