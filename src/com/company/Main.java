package com.company;

public class Main {

    public static void main(String[] args) {
        Printable printable1 = new Father("Учитель", 20);
        Printable printable2 = new Mother("Рисование", 1);
        Printable printable3 = new Child("Малыш", 3);
        printable1.print();
        printable2.print();
        printable3.print();

        creatObject("Father").print();
        creatObject("Mother").print();
        creatObject("Child").print();

    }

    public static Printable creatObject(String className) {
        Printable print = null;
        switch (className) {
            case "Father":
                print = new Father("Водитель", 10);
                break;
            case "Mother":
                print = new Mother("Пение", 2);
                break;
            case "Child":
                print = new Child("Ляля", 2);
                break;
        }
        return print;
    }
}
