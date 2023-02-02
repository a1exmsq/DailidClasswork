package by.academy.classwork.lesson20.task1;

public class Cat {

    private String name;
    public int age;
    protected Double weight;

    public Cat() {
    }

    public Cat(String name, int age, Double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Кот ест");
    }

    protected void walk(){
        System.out.println("Кот гуляет");
    }

    private void sleep(){
        System.out.println("Кот спит");
    }


}
