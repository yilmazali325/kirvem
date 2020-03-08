package com.dinazor.core.dto.user;

import com.dinazor.core.dto.abstracts.SuperDto;
import com.dinazor.core.entity.user.UserEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class UserDto extends SuperDto<UserDto, UserEntity> {

    public UserDto() {
        setDtoClass(UserDto.class);
        setEntityClass(UserEntity.class);
    }

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
