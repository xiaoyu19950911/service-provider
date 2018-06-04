package com.provider.user.controller;

import com.hero.fitness.utils.Result;
import com.provider.user.model.User;
import com.provider.user.response.UserGetResponse;
import com.provider.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: service-provider
 * @description:
 * @author: XiaoYu
 * @create: 2018-06-04 11:08
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/getUser",produces = {"application/json;charsetUTF-8"})
    public Result<UserGetResponse> getUser() {
        return userService.getUser();
    }

    @GetMapping(value = "/getUserList",produces = {"application/json;charsetUTF-8"})
    public List<User> getUserList() {
        return userService.getUser().getResult().getUserList();
    }
}
