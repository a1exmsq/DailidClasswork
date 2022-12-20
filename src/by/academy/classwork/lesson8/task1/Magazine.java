package by.academy.classwork.lesson8.task1;

import java.util.Objects;

public class Magazine implements Printable {

    private String name;

    private int year;

    public Magazine(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Magazine() {
        super();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String
    toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + name + " год выпуска: " + year);
    }

    static void printMagazines(Printable[] printable){
        for (Printable p : printable){
            if (p instanceof Magazine){
                p.print();
            }
        }
    }
}
