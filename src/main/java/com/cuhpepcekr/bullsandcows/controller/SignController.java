package com.cuhpepcekr.bullsandcows.controller;

import com.cuhpepcekr.bullsandcows.entity.User;
import com.cuhpepcekr.bullsandcows.service.SignService;
import com.cuhpepcekr.bullsandcows.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"Sign"})
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api")
public class SignController {

    @Autowired
    UserService userService;
    @Autowired
    SignService signService;

    @ApiOperation(value = "로그인", notes = "로그인합니다.")
    @PostMapping(value = "/signin")
    public String signIn(@ApiParam(value = "아이디", required = true) @RequestParam String username,
                         @ApiParam(value = "비밀번호", required = true) @RequestParam String password) {

        return signService.signIn(User.builder().username(username).password(password).build());
    }

    @ApiOperation(value = "가입", notes = "회원 가입합니다.")
    @PostMapping(value = "/signup")
    public ResponseEntity<?> signUp(@ApiParam(value = "아이디", required = true) @RequestParam String username,
                                    @ApiParam(value = "비밀번호", required = true) @RequestParam String password,
                                    @ApiParam(value = "이름", required = true) @RequestParam String name) {
        signService.signUp(User.builder().username(username).password(password).name(name).build());
        return new ResponseEntity<>(HttpStatus.CREATED);

    }
}