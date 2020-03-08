package com.dinazor.core.model;

import lombok.Getter;
import lombok.Setter;

public class DinazorDataResult<T> extends DinazorResult {
    @Getter
    @Setter
    private T data;
}
