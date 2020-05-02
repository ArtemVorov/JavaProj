package com.company.lesson05;

public class User {
    private int age;
    private String name;
    private String passportData;

    public User(){

    }

    public User(int age, String name){
        this.age = age;
        this.name = name;
    }

    public User(int age, String name, String passportData) {
        this.age = age;
        this.name = name;
        this.passportData = passportData;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void talk(String text){
        System.out.println(text);
    }

    public static void m(){
    }
}
