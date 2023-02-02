package by.academy.classwork.lesson15.task8;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Product> hm = new HashMap<>();
        hm.put("Мяч", new Product(10, "белый"));
        hm.put("Трансформер", new Product(10, "красный"));
        hm.put("Машинка", new Product(10, "серебряный"));
        System.out.println(hm.entrySet());
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        for (Map.Entry<String, Product> toy : hm.entrySet()){
            System.out.printf("Key: %s, Value: " + toy.getValue(), toy.getKey());
        }
    }
}