package com.jrda.kata_log.banking.hex.user.application;

import com.jrda.kata_log.banking.hex.user.domain.User;
import com.jrda.kata_log.banking.hex.user.domain.UserRepository;

public class UserCreator {
    private final UserRepository userRepository;

    public UserCreator(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create(String name, String lastname, String username) {
        User user = new User(name, lastname);
        user.setUserName(username);
        userRepository.storeUser(user);
    }
}
