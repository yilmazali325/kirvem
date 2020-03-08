package com.dinazor.user.controller;


import com.dinazor.core.controller.DinazorCrudController;
import com.dinazor.core.dto.user.UserDto;
import com.dinazor.user.service.interfaces.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController extends DinazorCrudController<IUserService, UserDto> {


}
