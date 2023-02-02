package by.academy.classwork.lesson13.box;

import java.util.ArrayList;
import java.util.List;

public class HeavyBox implements Comparable<HeavyBox>{
    int weight;
    int width;
    int height;
    int depth;

    public HeavyBox(int w, int h, int d, int m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }

    public static void main(String[] args) {
        List<HeavyBox> arrayList = new ArrayList<>();
        arrayList.add(new HeavyBox(2,3,4,5));
        arrayList.add(new HeavyBox(4,3,5,2));
        arrayList.add(new HeavyBox(1,1,1,1));
        for (HeavyBox box: arrayList) {
            System.out.println(box);
        }
        arrayList.get(0).weight = 1;

    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }

    @Override
    public int compareTo(HeavyBox o) {
        return this.weight - o.weight;
    }
}
