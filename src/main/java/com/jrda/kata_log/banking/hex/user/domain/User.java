package com.jrda.kata_log.banking.hex.user.domain;

import java.util.Objects;

public class User {
    private final String name;
    private final String lastname;
    private String userId;
    private String username;

    public User(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getUserName() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name) && lastname.equals(user.lastname) && username.equals(user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }
}
