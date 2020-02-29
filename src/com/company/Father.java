package com.company;

public class Father extends Family implements Printable {
    String proffesion;
    int experience;

    public Father(String proffesion, int experience) {
        this.proffesion = proffesion;
        this.experience = experience;
    }

    @Override
    public void print() {
        System.out.println("Профессия : " + this.proffesion + " " + "Стаж работы: " + this.experience);

    }
}
