package by.academy.classwork.lesson17.Task1;

import java.io.Serializable;
import java.util.Objects;

public class Cat implements Serializable {

    private static final long serialVersionUID = 37;

    private String name;
    private transient int age;
    private double weight;

    public Cat(String name, int age, double weight) {
        super();
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(cat.weight, weight) == 0 && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

}
