package com.rad.fairyteller.service

import com.rad.fairyteller.domain.user.User
import com.rad.fairyteller.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService (private val userRepository: UserRepository) {

    fun saveOrUpdate(user: User) {
        userRepository.save(user)
    }

    fun deleteUser(id: Long?) {
        userRepository.delete(id)
    }
}