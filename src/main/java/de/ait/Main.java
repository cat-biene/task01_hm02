package de.ait;

import de.ait.model.User;

public class Main {
    public static void main(String[] args) {

        User user = new User(1L, "Jack", "email1");
        System.out.println(user);
    }
}