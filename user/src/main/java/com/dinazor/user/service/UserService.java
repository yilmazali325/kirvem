package com.dinazor.user.service;


import com.dinazor.core.dto.user.UserDto;
import com.dinazor.core.entity.user.UserEntity;
import com.dinazor.core.model.DinazorDataResult;
import com.dinazor.user.repository.UserRepo;
import com.dinazor.user.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserDto userDto;


    //@Secured(RoleEnum.VIEW_USER)
    //@ExecutionTimeLog
    public DinazorDataResult<ArrayList<UserDto>> findAll() {
        DinazorDataResult<ArrayList<UserDto>> result = new DinazorDataResult<>();
        result.setData(new ArrayList<>());

        Iterable<UserEntity> list = userRepo.findAll();

        for (UserEntity entity : list) {
            userDto = userDto.convertToDto(entity);
            result.getData().add(userDto);
        }

        result.makeSuccess();
        return result;
    }

    @Override
    public DinazorDataResult<UserDto> findById(Long id) {
        DinazorDataResult<UserDto> result = new DinazorDataResult<>();
        Optional<UserEntity> entity = userRepo.findById(id);
        if (entity.isPresent()) {
            UserDto dto = new UserDto();
            dto = dto.convertToDto(entity.get());
            result.setData(dto);
            result.makeSuccess();
        }
        return result;
    }
}
