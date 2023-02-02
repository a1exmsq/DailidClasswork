package by.academy.classwork.lesson18;

import by.academy.classwork.lesson12.Printable;

public class Task1 {

    public static void main(String[] args) {
        Printable printable = () -> System.out.println("Hello World!");
        printable.print();
    }



}
