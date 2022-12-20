package by.academy.classwork.lesson8.task1;

public class Main {

    public static void main(String[] args) {
        Printable[] array = new Printable[5];
        array[0] = new Book("Колобок");
        array[1] = new Book("Конек-горбунок");
        array[2] = new Book("Илья Муромец");
        array[3] = new Magazine("Рыбалка", 2021);
        array[4] = new Magazine("Top Gear", 2007);
        for (Printable p : array) {
            p.print();
        }
        System.out.println("--------------------------");
        Book.printBooks(array);
        Magazine.printMagazines(array);
    }
}
