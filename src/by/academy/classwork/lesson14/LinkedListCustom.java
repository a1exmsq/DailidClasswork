package by.academy.classwork.lesson14;

public class LinkedListCustom<T> {

    private Node head;
    private Node tail;
    private int size;

    public void add(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            tail = newNode;
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void print(){
        Node currentNode = head;

        while (currentNode != null){
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    public T get (int index){
        if(index >= size || index < 0){
            return null;
        }
        int counter = 0;
        Node currentNode = head;
        while (counter < index) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;

            counter++;
        }
        return currentNode.value;
    }
    private Node getNode(int index) {
        if (index < 0 || index > size - 1) {
            System.err.println("Index of bound exception");
            return null;
        }
        int counter = 0;
        Node currentNode = head;
        while (counter < index) {
            currentNode = currentNode.next;
            counter++;
        }
        return currentNode;
    }


    public void add(int index, T value) {
        if (index < 0 || index > size -1 ){
            System.err.println("Index of bound exception");
            return;
        }
        Node newNode = new Node(value);
        if(index == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            size++;
            return;
        }

        if(index == size){
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            size++;
            return;
        }

        Node nextNode = getNode(index);
        Node prevNode = nextNode.prev;

        prevNode.next = newNode;
        nextNode.prev = newNode;

        newNode.next = nextNode;
        newNode.prev = prevNode;

        size++;

    }
    class Node{
        T value;
        Node prev;
        Node next;

        public Node(T value) {
            super();
            this.value = value;
        }
    }

}
