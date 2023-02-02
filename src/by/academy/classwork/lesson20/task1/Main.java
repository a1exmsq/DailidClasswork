package by.academy.classwork.lesson20.task1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Кот", 6, 6.3);
        Tiger tiger = new Tiger("Тигр", 8, 106.3, "оранжевый", true, 151.2);
        Class<Cat> catClass = Cat.class;
        Class<Tiger> tigerClass = Tiger.class;
        Class<? extends Cat> tigerClass1 = tiger.getClass();
        Method[] catDeclaredMethods = catClass.getDeclaredMethods();
        Method[] tigerDeclaredMethods = tigerClass.getDeclaredMethods();
        Field[] catDeclaredFields = catClass.getDeclaredFields();
        Field[] tigerDeclaredFields = tigerClass.getDeclaredFields();
        Method getRunMethod;

            try {
                getRunMethod = tigerClass1.getDeclaredMethod("run");
                getRunMethod.setAccessible(true);
                Object resultValue = getRunMethod.invoke(tiger);
                System.out.println(resultValue);

            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }



        System.out.println("все методы в классе Cat:");
        for (Method method : catDeclaredMethods) {
            System.out.println(method);
        }
        System.out.println("все переменные в классе Cat:");
        for (Field field : catDeclaredFields) {
            System.out.println(field);
        }
        System.out.println("все методы в классе Tiger:");
        for (Method method : tigerDeclaredMethods) {
            System.out.println(method);
        }
        System.out.println("все переменные в классе Tiger:");
        for (Field field : tigerDeclaredFields) {
            System.out.println(field);
        }

        try {
            Field name = catClass.getDeclaredField("name");
            name.setAccessible(true);
            try {
                name.set(cat, "Name");
                System.out.println("Изменено имя кота на: " + cat.getName());
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

        try {
            Field color = tigerClass.getDeclaredField("color");
            try {
                color.set(tiger, "белый");
                System.out.println("Изменен цвет тигра на: " + tiger.getColor());
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }

    }
}
