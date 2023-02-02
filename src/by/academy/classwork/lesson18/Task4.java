package by.academy.classwork.lesson18;


import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) {

        Predicate<String> stringPredicateNonEmpty = s -> (s.length() != 0);
        Predicate<String> stringPredicateNonNull = s -> (s != null);
        System.out.println(stringPredicateNonEmpty.and(stringPredicateNonNull).test(""));
    }
}
