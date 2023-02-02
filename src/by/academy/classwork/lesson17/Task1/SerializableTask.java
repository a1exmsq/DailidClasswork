package by.academy.classwork.lesson17.Task1;

import java.io.*;

public class SerializableTask {

    public static void main(String[] args) throws IOException {


    File dir = new File("src\\io");
    if(!dir.exists()){
        dir.mkdirs();
    }

    File file = new File(dir, "cat.txt");
    if(!file.exists()){
        file.createNewFile();
    }

    Cat cat = new Cat("Барсик", 6, 7.1);


//    try (BufferedInputStream bos = new BufferedOutputStream(new FilterOutputStream(file));
//        ObjectOutputStream oos = new ObjectOutputStream(bos)){
//        oos.writeObject();

//
//    }
}
}