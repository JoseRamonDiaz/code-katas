package com.jrda.kata_log.banking.hex.user.application;

import com.jrda.kata_log.banking.hex.account.domain.AccountRepository;
import com.jrda.kata_log.banking.hex.user.domain.User;
import com.jrda.kata_log.banking.hex.user.domain.UserRepository;

public class AccountRemover {
    private UserRepository userRepository;
    private AccountRepository accountRepository;

    public AccountRemover(UserRepository userRepository, AccountRepository accountRepository) {
        this.userRepository = userRepository;
        this.accountRepository = accountRepository;
    }

    public void remove(String userName, int accountId){
        User user = userRepository.getByUsername(userName);
        user.removeAccount(accountRepository.getById(accountId));
        userRepository.storeUser(user);
    }
}
