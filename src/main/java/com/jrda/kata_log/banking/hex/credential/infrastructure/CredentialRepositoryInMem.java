package com.jrda.kata_log.banking.hex.credential.infrastructure;

import com.jrda.kata_log.banking.hex.credential.domain.Credential;
import com.jrda.kata_log.banking.hex.credential.domain.CredentialRepository;

import java.util.HashMap;
import java.util.Map;

public class CredentialRepositoryInMem implements CredentialRepository {
    private Map<String, Credential> credentialMap = new HashMap<>();

    @Override
    public void storeCredentials(Credential credential) {
       credentialMap.put(credential.getUser(), credential);
    }
}
