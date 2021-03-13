package com.jrda.kata_log.banking.hex.user.infrastructure;

import com.jrda.kata_log.banking.hex.user.domain.User;
import com.jrda.kata_log.banking.hex.user.domain.UserRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserRepositoryIM implements UserRepository {
    private Map<String, User> userMap = new HashMap<>();

    @Override
    public void storeUser(User user) {
        user.setId(UUID.randomUUID().toString());
        userMap.put(user.getUserName(), user);
    }

    @Override
    public User getByUsername(String userId) {
        return userMap.get(userId);
    }
}
