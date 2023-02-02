package by.academy.classwork.lesson9.task1;

import java.time.LocalDate;
import java.time.Month;

public class Task1 {

    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(2003, Month.JULY, 17);

        System.out.println("День недели: " + dateOfBirth.getDayOfWeek() + " день в году: " + dateOfBirth.getDayOfYear()
                + " " + dateOfBirth.getMonth() + " " + dateOfBirth.getYear());

        LocalDate now = LocalDate.now();

        System.out.println(now.isAfter(dateOfBirth));
        System.out.println(now.isBefore(dateOfBirth));
    }
}
