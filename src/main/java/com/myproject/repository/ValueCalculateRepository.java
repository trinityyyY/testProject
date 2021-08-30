package com.myproject.repository;

import com.myproject.entity.Value;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ValueCalculateRepository extends Repository<Value, Long> {

    @Query("SELECT SUM(v.value) FROM Value v")
    Double calculateSumAll();

    @Query("SELECT SUM(v.value) FROM Value v WHERE v.id IN (?1)")
    Double calculateSumByListId(List<Long> ids);

    @Query("SELECT MAX(v.value) FROM Value v")
    Double calculateMaxAll();

    @Query("SELECT MAX(v.value) FROM Value v WHERE v.id IN (?1)")
    Double calculateMaxByIdList(List<Long> ids);

    @Query("SELECT MIN(v.value) FROM Value v")
    Double calculateMinAll();

    @Query("SELECT MIN(v.value) FROM Value v WHERE v.id IN(?1)")
    Double calculateMinByIdList(List<Long> ids);

    @Query("SELECT AVG(v.value) FROM Value v")
    Double calculateAvgAll();

    @Query("SELECT AVG(v.value) FROM Value v WHERE v.id IN (?1)")
    Double calculateAvgByIdList(List<Long> ids);
}
