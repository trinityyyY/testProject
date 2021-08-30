package com.myproject.service;

import com.myproject.dto.ValueDTO;
import com.myproject.entity.Value;

import java.util.List;

public interface MyService {

    Value create(ValueDTO dto);

    Double calculate(String fun, List<Long> ids);

}
