package com.pls.demo;

public class Animal {

    int age;
    String name;

    Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    public void makeNoise(String noise) {
        System.out.println(noise);
    }

}
