package by.academy.classwork.lesson18;

import java.util.function.Function;

public class Task10 {
    public static void main(String[] args) {
        Function<Double, Double> test = v -> Math.abs(v);
        System.out.println(test.apply(-1.0));

        Function<Double, Double> test1 = Math::abs;
        System.out.println(test1.apply(-128.0));
    }
}

