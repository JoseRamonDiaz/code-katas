package com.jrda.kata_log.banking.hex.credential.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class CredentialTest {
    @Test
    public void TestCredential() {
        Credential credential = new Credential("dummy-user", "dummy-pass");

        assertNotNull(credential.getUser());
        assertFalse(credential.getUser().isEmpty());
        assertEquals("dummy-user", credential.getUser());

        assertNotNull(credential.getPass());
        assertFalse(credential.getPass().isEmpty());
        assertEquals("dummy-pass", credential.getPass());

        Credential credential1 = new Credential("user2", "pass2");
        assertEquals("user2", credential1.getUser());
        assertEquals("pass2", credential1.getPass());
    }

    @Test
    public void testEqualsCredentials() {
        Credential credential = new Credential("user", "pass");
        Credential credential1 = new Credential("user", "pass");

        assertEquals(credential, credential1);
    }
}
