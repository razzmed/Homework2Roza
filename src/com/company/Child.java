package com.company;

public class Child extends Family implements Printable {
    String name;
    int age;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("Имя ребенка: " + this.name + " " + "Возраст ребенка: " + this.age);

    }
}
