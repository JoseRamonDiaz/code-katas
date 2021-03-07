package com.jrda.kata_log.banking.hex.user.application;

import com.jrda.kata_log.banking.hex.credential.application.CredentialCreator;
import com.jrda.kata_log.banking.hex.credential.domain.Credential;
import com.jrda.kata_log.banking.hex.credential.domain.CredentialRepository;
import com.jrda.kata_log.banking.hex.user.domain.User;
import com.jrda.kata_log.banking.hex.user.domain.UserRepository;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class RegisterUserTest {
    @Test
    public void testRegisterUser() {
        UserRepository userRepository = Mockito.mock(UserRepository.class);
        CredentialRepository credentialRepository = Mockito.mock(CredentialRepository.class);

        UserCreator userCreator = new UserCreator(userRepository);
        CredentialCreator credentialCreator = new CredentialCreator(credentialRepository);

        RegisterUser registerUser = new RegisterUser(userCreator, credentialCreator);
        registerUser.register("Ian", "Hansen", "i", "h");

        User user = new User("Ian", "Hansen");
        user.setUserName("i");
        verify(userRepository, times(1)).storeUser(user);

        verify(credentialRepository, times(1)).storeCredentials(new Credential("i", "h"));

        registerUser.register("Micky", "Mouse", "u", "p");
        User user1 = new User("Micky", "Mouse");
        user1.setUserName("u");
        verify(userRepository, times(1)).storeUser(user1);

        verify(credentialRepository, times(1)).storeCredentials(new Credential("u", "p"));
    }
}
