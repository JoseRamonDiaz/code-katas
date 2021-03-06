package com.jrda.kata_log.banking.hex.user.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class UserTest {
    private User user;

    @Before
    public void init() {
        user = new User("Ian", "Hansen");
    }

    @Test
    public void testUser() {
        assertNotNull(user.getName());
        assertFalse(user.getName().isEmpty());
        assertEquals("Ian", user.getName());

        User user1 = new User("Bob", "Smith");
        assertEquals("Bob", user1.getName());

        assertNotNull(user.getLastname());
        assertFalse(user.getLastname().isEmpty());
        assertEquals("Hansen", user.getLastname());

        assertEquals("Smith", user1.getLastname());
    }

    @Test
    public void testUserId() {
        String userId = UUID.randomUUID().toString();
        user.setId(userId);

        assertNotNull(user.getUserId());
        assertFalse(user.getUserId().isEmpty());
        assertEquals(userId, user.getUserId());

        String secondUserid = UUID.randomUUID().toString();

        user.setId(secondUserid);
        assertEquals(secondUserid, user.getUserId());
    }

    @Test
    public void testUserName() {
        String userName = "user-name-val";
        user.setUserName(userName);
        assertNotNull(user.getUserName());
        assertFalse(user.getUserName().isEmpty());
        assertEquals(userName, user.getUserName());

        user.setUserName("other-username-val");
        assertEquals("other-username-val", user.getUserName());
    }

    @Test
    public void testEquals() {
        User user1 = new User(user.getName(), user.getLastname());
        assertEquals(user1, user);
    }

    @Test
    public void testNotEquals() {
        user.setUserName("a");
        User user1 = new User(user.getName(), user.getLastname());
        user1.setUserName("b");
        assertNotEquals(user1, user);
    }
}
