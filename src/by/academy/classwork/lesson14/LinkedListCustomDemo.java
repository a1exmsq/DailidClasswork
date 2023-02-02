package by.academy.classwork.lesson14;

public class LinkedListCustomDemo {

    public static void main(String[] args) {
        LinkedListCustom<String> ll = new LinkedListCustom<>();

        ll.add("Ф");
        ll.add("И");
        ll.add("И");
        ll.add("З");

        ll.print();
//        ll.add(0, "new");

        System.out.println();
        System.out.println(ll.get(2));
    }
}
