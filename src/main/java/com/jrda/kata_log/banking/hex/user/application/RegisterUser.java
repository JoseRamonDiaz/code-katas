package com.jrda.kata_log.banking.hex.user.application;

import com.jrda.kata_log.banking.hex.credential.application.CredentialCreator;

public class RegisterUser {
    private final UserCreator userCreator;
    private final CredentialCreator credentialCreator;

    public RegisterUser(UserCreator userCreator, CredentialCreator credentialCreator) {
        this.userCreator = userCreator;
        this.credentialCreator = credentialCreator;
    }

    public void register(String name, String lastname, String username, String pass) {
        userCreator.create(name, lastname, username);
        credentialCreator.createCredential(username, pass);
    }
}
