package com.dinazor.core.entity.abstracts;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class SoftDeleteEntity extends SuperEntity{

    @Getter
    @Setter
    private boolean deleted;
}
