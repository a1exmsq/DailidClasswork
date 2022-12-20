package by.academy.classwork.lesson8.task2;

public class Drum implements Tool {

    private double size;

    public Drum(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Drum() {
    }

    @Override
    public void play() {
        System.out.println("Играет гитара c " );
    }
}
