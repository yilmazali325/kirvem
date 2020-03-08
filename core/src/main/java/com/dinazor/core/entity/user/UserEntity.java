package com.dinazor.core.entity.user;

import com.dinazor.core.entity.abstracts.SoftDeleteEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class UserEntity extends SoftDeleteEntity {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String surname;

    @Getter
    @Setter
    private String mail;

    @Getter
    @Setter
    private String password;
}
