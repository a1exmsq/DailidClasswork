package by.academy.classwork.lesson13.box;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeavyBox {
    int weight;
    int width;
    int height;
    int depth;

    HeavyBox(int w, int h, int d, int m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
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

    public static void main(String[] args) {
        List<HeavyBox> arrayList = new ArrayList<>();
        arrayList.add(new HeavyBox(1,3,4,5));
        arrayList.add(new HeavyBox(4,3,5,2));
        arrayList.add(new HeavyBox(1,1,1,1));
        for (HeavyBox box: arrayList) {
            System.out.println(box);
        }




    }
}
