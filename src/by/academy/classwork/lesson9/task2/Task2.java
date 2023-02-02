package by.academy.classwork.lesson9.task2;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;

public class Task2 {

    public static void main(String[] args) {
        LocalDate[] arr = new LocalDate[5];
        arr[0] = LocalDate.of(2023, Month.JANUARY, 1);
        arr[1] = LocalDate.of(2023, Month.JANUARY, 7);
        arr[2] = LocalDate.of(2023, Month.MARCH, 8);
        arr[3] = LocalDate.of(2023, Month.JULY, 3);
        arr[4] = LocalDate.of(2023, Month.DECEMBER, 25);
        DateTimeFormatter.ofPattern("dd-MM-yyyy");


    }
}








//for (int i = 0; i < arr.length; i++){
//
//
//        }