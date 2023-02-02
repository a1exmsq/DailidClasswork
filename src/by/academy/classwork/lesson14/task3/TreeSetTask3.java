package by.academy.classwork.lesson14.task3;

import by.academy.classwork.lesson13.box.HeavyBox;

import java.util.TreeSet;

public class TreeSetTask3 {
    public static void main(String[] args) {

        TreeSet<HeavyBox> hb = new TreeSet<>();
        hb.add(new HeavyBox(2,3,4,5));
        hb.add(new HeavyBox(4,3,5,2));
        hb.add(new HeavyBox(1,1,1,1));
        for (HeavyBox box : hb) {
            System.out.println(box);
        }
    }
}