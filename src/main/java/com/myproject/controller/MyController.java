package com.myproject.controller;

import com.myproject.dto.ValueDTO;
import com.myproject.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("start")
public class MyController {

    @Autowired
    private MyService service;

    @GetMapping("value/avg")
    public Double calculateAvg(@RequestParam List<Long> ids) {
        return this.service.calculate("avg", ids);
    }

    @GetMapping("value/max")
    public Double calculateMax(@RequestParam List<Long> ids) {
        return this.service.calculate("max", ids);
    }

    @GetMapping("value/min")
    public Double calculateMin(@RequestParam List<Long> ids) {
        return this.service.calculate("min", ids);
    }

    @GetMapping("value/sum")
    public Double calculateSum(@RequestParam List<Long> ids) {
        return this.service.calculate("sum", ids);
    }

    @PostMapping("/value")
    public String create(@RequestBody final ValueDTO dto) {
        return this.service.create(dto).getId().toString();
    }

}
