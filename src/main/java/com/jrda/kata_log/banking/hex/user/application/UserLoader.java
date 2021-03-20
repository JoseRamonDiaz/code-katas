package com.jrda.kata_log.banking.hex.user.application;

import com.jrda.kata_log.banking.hex.user.domain.User;
import com.jrda.kata_log.banking.hex.user.domain.UserRepository;

public class UserLoader {
    private final UserRepository userRepository;

    public UserLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User load(String username) {
        return userRepository.getByUsername(username);
    }
}
