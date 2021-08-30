package com.myproject.dto;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class ValueDTO {

    @NotNull
    @Min(Integer.MAX_VALUE)
    @Max(Integer.MAX_VALUE)
    private final Integer value;

    @JsonCreator
    public ValueDTO(@JsonProperty("value") final Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }
}
