package pl.anna.lesson1.exercise;

import java.util.Arrays;

public class Identity {

    private User[] users;

    public Identity(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
