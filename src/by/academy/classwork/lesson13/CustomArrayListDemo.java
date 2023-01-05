package by.academy.classwork.lesson13;

public class CustomArrayListDemo {
    public static void main(String[] args) {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.print();

        list.add("Test1");
        list.add("Test2");
        list.add("Test3");
        list.add("Test4");

        list.print();

        System.out.println(list.get(2));
        System.out.println(list.getLast());
        System.out.println(list.getFirst());

        list.remove(1);
        list.print();
    }
}
