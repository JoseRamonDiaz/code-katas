package com.jrda.kata_log.banking.hex.user.application;

import com.jrda.kata_log.banking.hex.account.domain.AccountRepository;
import com.jrda.kata_log.banking.hex.user.domain.User;
import com.jrda.kata_log.banking.hex.user.domain.UserRepository;

public class AccountAdder {
    private UserRepository userRepository;
    private AccountRepository accountRepository;

    public AccountAdder(UserRepository userRepository, AccountRepository accountRepository) {
        this.userRepository = userRepository;
        this.accountRepository = accountRepository;
    }

    public void add(String username, Integer accountId) {
        User user = userRepository.getByUsername(username);
        user.addAccount(accountRepository.getById(accountId));
        userRepository.storeUser(user);
    }
}
