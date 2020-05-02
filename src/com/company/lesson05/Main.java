package com.company.lesson05;
// user[[Alex][]] user1[[Alex1][]]   [30]
public class Main {
    public static void main(String[] args) {
        User user = new User(30, "Alex", "pass");
        System.out.println(user.getName());
        user.setName("Vasya");
        System.out.println(user.getName());

        User user1 = new User(30, "Alex");
        System.out.println(user1.getName());

        User user2 = new User();
        System.out.println(user2.getName());
        System.out.println(user2.getAge());
    }
}
