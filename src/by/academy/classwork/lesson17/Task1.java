//package by.academy.classwork.lesson17;
//
//import java.io.*;
//
//public class Task1 {
//    private final static String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
//    private final static String replaceChars = "aoeiuy";
//
//    public static final String INPUT_FILE_PATH = "src\\io\\file1.txt";
//    public static final String OUTPUT_FILE_PATH = "src\\io\\file2.txt";
//
//    public static void main(String[] args) throws IOException {
//        File dir = new File("src/io/");
//
//        if (!dir.exists()) {
//            dir.mkdirs();
//        }
//
//        File inputFile = new File(INPUT_FILE_PATH);
//        if (!inputFile.exists()) {
//            inputFile.createNewFile();
//        }
//
//        File outputFile = new File(OUTPUT_FILE_PATH);
//        if (!outputFile.exists()) {
//            outputFile.createNewFile();
//        }
//
////        char[] charArray = replaceChars.toCharArray();
//
//        try (FileWriter fw = new FileWriter(inputFile);
//             FileInputStream fis = new FileInputStream(inputFile);
//             FileOutputStream fos = new FileOutputStream(outputFile);
//             ) {
//             fw.write(text);
//             int a;
//             while ((a = fis.read()) != -1) {
//                 System.out.println((char) a);
//                 if (replaceChars.contains(Character.valueOf((char) ).toString())) {
//                     fos.write('!');
//                 } else {
//                     fos.write(a);
//
//                 }
//
//
//            }
//        }
//    }
//}