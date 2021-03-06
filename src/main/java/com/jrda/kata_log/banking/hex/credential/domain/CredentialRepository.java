package com.jrda.kata_log.banking.hex.credential.domain;

public interface CredentialRepository {
    void storeCredentials(Credential credential);
}
