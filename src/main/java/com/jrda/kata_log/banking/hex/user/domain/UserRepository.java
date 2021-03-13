package com.jrda.kata_log.banking.hex.user.domain;

public interface UserRepository {
    void storeUser(User user);
    User getByUsername(String username);
}
