package com.dinazor.core.service.abstracts;

import com.dinazor.core.dto.abstracts.SuperDto;
import com.dinazor.core.model.DinazorDataResult;

import java.util.ArrayList;

public interface IDinazorService<TDto extends SuperDto> {

    DinazorDataResult<ArrayList<TDto>> findAll();

    DinazorDataResult<TDto> findById(Long id);
}
