package com.jrda.kata_log.banking.hex.credential.application;

import com.jrda.kata_log.banking.hex.credential.domain.Credential;
import com.jrda.kata_log.banking.hex.credential.domain.CredentialRepository;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class CredentialCreatorTest {
    @Test
    public void testCreateCredential() {
        CredentialRepository credentialRepository = Mockito.mock(CredentialRepository.class);

        CredentialCreator credentialCreator = new CredentialCreator(credentialRepository);
        credentialCreator.createCredential("user", "pass");

        Credential credential = new Credential("user", "pass");

        verify(credentialRepository, times(1)).storeCredentials(credential);
    }
}
