package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    public static List<User> getUsersList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Hannah Holden", 50, 7, "Chemists"));
        users.add(new User("Larry Hunter", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Ursula Menzie", 49, 0, "Board"));
        users.add(new User("Oswald Keller", 44, 2, "Chemists"));
        users.add(new User("Wilbur Nunez", 57, 0, "Security"));
        return users;
    }

}