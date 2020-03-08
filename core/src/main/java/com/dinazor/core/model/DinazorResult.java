package com.dinazor.core.model;

import com.dinazor.core.enums.StatusCode;
import lombok.Getter;
import lombok.Setter;

public class DinazorResult {
    @Getter
    @Setter
    private StatusCode statusCode;

    @Getter
    @Setter
    private String message;

    public DinazorResult makeSuccess() {
        this.statusCode = StatusCode.SUCCESS;
        return this;
    }
}
