package com.tfauves.user.controller;

import com.tfauves.user.VO.ResponseTemplateVO;
import com.tfauves.user.enity.Users;
import com.tfauves.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public Users saveUser(@RequestBody Users users) {
        log.info("Inside saveUser: method of UserController");
        return userService.saveUser(users);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
        log.info("Inside getUserWithDepartment: method of UserController");
        return userService.getUserWithDepartment(userId);
    }



}
