package com.myproject.repository;

import com.myproject.entity.Value;
import org.springframework.data.repository.Repository;

public interface ValueCrudRepository extends Repository<Value, Long> {

    Value save(Value val);

}
