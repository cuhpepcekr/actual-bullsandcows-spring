package com.cuhpepcekr.bullsandcows.controller;

import com.cuhpepcekr.bullsandcows.entity.User;
import com.cuhpepcekr.bullsandcows.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = {"User"})
@RestController()
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "모든 회원 조회", notes = "모든 회원을 조회합니다.")
    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
