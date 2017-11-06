package com.rad.fairyteller.controller

import com.rad.fairyteller.service.UserService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userService: UserService) {

    @RequestMapping(path = arrayOf("/user/delete/{id}"))
    fun deleteUser(@PathVariable id: Long?) {
        userService.deleteUser(id)
    }
}