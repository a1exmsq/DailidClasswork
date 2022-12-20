package by.academy.classwork.lesson8.task1;

public class Book implements Printable {

    private String name;

    public Book() {
        super();
    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Book: " + name);
    }

    static void printBooks (Printable[] printable){
        for (Printable p : printable){
            if (p instanceof Book){
                p.print();
            }
        }
    }
}
