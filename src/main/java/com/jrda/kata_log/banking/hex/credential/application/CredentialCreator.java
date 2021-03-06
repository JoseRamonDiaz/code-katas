package com.jrda.kata_log.banking.hex.credential.application;

import com.jrda.kata_log.banking.hex.credential.domain.Credential;
import com.jrda.kata_log.banking.hex.credential.domain.CredentialRepository;

public class CredentialCreator {
    private final CredentialRepository credentialRepository;

    public CredentialCreator(CredentialRepository credentialRepository) {
        this.credentialRepository = credentialRepository;
    }

    public void createCredential(String user, String pass) {
        Credential credential = new Credential(user, pass);
        credentialRepository.storeCredentials(credential);
    }
}
