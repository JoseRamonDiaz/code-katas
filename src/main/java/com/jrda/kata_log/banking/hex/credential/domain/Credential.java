package com.jrda.kata_log.banking.hex.credential.domain;

import java.util.Objects;

public class Credential {
    private final String user;
    private final String pass;

    public Credential(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Credential that = (Credential) o;
        return user.equals(that.user) && pass.equals(that.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, pass);
    }
}
