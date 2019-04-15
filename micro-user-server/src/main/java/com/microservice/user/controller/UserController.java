package com.microservice.user.controller;

import com.microservice.user.domain.UserInfo;
import com.microservice.user.dto.UserDTO;
import com.microservice.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ryz2593
 * @date 2019/4/15
 * @desc
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{userId}")
    public UserInfo getUser(@PathVariable("userId") Integer userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("/user/detail/{userId}")
    public UserDTO getUserDetail(@PathVariable("userId") Integer userId) {
        return userService.getUserDto(userId);
    }

}
