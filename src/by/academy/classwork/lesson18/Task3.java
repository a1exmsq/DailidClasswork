package by.academy.classwork.lesson18;

import java.util.Scanner;
import java.util.function.Predicate;

public class Task3 {

    public static void main(String[] args) {
        Predicate<String> stringPredicate = s -> (s.length() != 0);
        System.out.println(stringPredicate.test(""));
    }


}
