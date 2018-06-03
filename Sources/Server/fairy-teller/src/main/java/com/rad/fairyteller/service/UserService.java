package com.rad.fairyteller.service;

import com.rad.fairyteller.domain.User;
import com.rad.fairyteller.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void saveOrUpdate(final User user) {
        Optional.ofNullable(user).ifPresent(userRepository::save);
    }

    public void deleteUser(final Long id) {
        userRepository.delete(id);
    }
}
