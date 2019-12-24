package pl.anna.lesson1;

import java.util.Arrays;

public class Street {
    private String streetName;
    private User[] users;

    public Street(String streetName, User[] users) {
        this.streetName = streetName;
        this.users = users;
    }

    @Override
    public String toString() {
        return "Street{" +
                "streetName='" + streetName + '\'' +
                ", users=" + Arrays.toString(users) +
                '}';
    }
}
