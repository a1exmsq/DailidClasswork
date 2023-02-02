package by.academy.classwork.lesson18;



import java.util.Objects;
import java.util.function.Predicate;

public class Task2 {

    public static void main(String[] args) {
        Predicate<String> p = obj -> Objects.nonNull(obj);
        System.out.println(p.test("nnn"));
    }
}
