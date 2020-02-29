package com.company;

public class Mother extends Family implements Printable {
    String hobby;
    int childNumber;

    public Mother(String hobby, int childNumber) {
        this.hobby = hobby;
        this.childNumber = childNumber;
    }

    @Override
    public void print() {
        System.out.println("Хобби: " + this.hobby + " " + "Число детей: " + this.childNumber);

    }
}
