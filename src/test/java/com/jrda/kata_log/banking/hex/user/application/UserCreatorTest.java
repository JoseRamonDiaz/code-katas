package com.jrda.kata_log.banking.hex.user.application;

import com.jrda.kata_log.banking.hex.user.domain.User;
import com.jrda.kata_log.banking.hex.user.domain.UserRepository;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class UserCreatorTest {
    @Test
    public void testUserCreation() {
        UserRepository userRepository = Mockito.mock(UserRepository.class);

        UserCreator userCreator = new UserCreator(userRepository);
        userCreator.create("Ian", "Hanson", "ian.hanson");

        User user = new User("Ian", "Hanson");
        user.setUserName("ian.hanson");
        verify(userRepository, times(1)).storeUser(user);
    }
}
