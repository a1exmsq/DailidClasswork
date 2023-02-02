package by.academy.classwork.lesson20.task1;

public class Tiger extends Cat {
    public String color;
    private boolean isDangerous;
    protected Double height;

    public Tiger() {
        super();
    }

    public Tiger(String name, int age, Double weight) {
        super(name, age, weight);
    }

    public Tiger(String color, boolean isDangerous, Double height) {
        this.color = color;
        this.isDangerous = isDangerous;
        this.height = height;
    }

    public Tiger(String name, int age, Double weight, String color, boolean isDangerous, Double height) {
        super(name, age, weight);
        this.color = color;
        this.isDangerous = isDangerous;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public void setDangerous(boolean dangerous) {
        isDangerous = dangerous;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void eat(){
        System.out.println("Тигр ест");
    }

    protected void walk(){
        System.out.println("Тигр гуляет");
    }

    private void sleep(){
        System.out.println("тигр спит");
    }

    private void run(){
        System.out.println("Тигр бежит");
    }
}
