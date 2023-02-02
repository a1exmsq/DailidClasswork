package by.academy.classwork.lesson18;

import java.util.function.Predicate;

public class Task5 {
    public static void main(String[] args) {
        Predicate<String> startJ = s -> s.startsWith("J");
        Predicate<String> startN = s -> s.startsWith("N");
        Predicate<String> endA = s -> s.endsWith("A");
    }
}
