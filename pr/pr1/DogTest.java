package com.company;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen");
        Dog d3 = new Dog();
        d3.setAge(1);
        d1.setBreed("Beagle");
        d2.setBreed("Boxer");
        d3.setBreed("Corgi");
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
