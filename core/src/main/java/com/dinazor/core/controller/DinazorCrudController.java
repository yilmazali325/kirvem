package com.dinazor.core.controller;

import com.dinazor.core.dto.abstracts.SuperDto;
import com.dinazor.core.model.DinazorDataResult;
import com.dinazor.core.service.abstracts.IDinazorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

public abstract class DinazorCrudController <TService extends IDinazorService, TDto extends SuperDto> extends DinazorController{
    @Autowired
    private TService service;


    @GetMapping
    public DinazorDataResult<ArrayList<TDto>> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public DinazorDataResult<TDto> findById(@PathVariable Long id) {
        return service.findById(id);
    }

}
