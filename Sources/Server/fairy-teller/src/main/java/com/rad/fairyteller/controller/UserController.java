package com.rad.fairyteller.controller;

import com.rad.fairyteller.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @RequestMapping(path = "/user/delete/{id}")
    public void deleteUser(@PathVariable final Long id) {
        userService.deleteUser(id);
    }
}
