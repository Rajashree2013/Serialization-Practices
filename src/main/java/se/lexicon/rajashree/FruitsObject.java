package se.lexicon.rajashree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FruitsObject {


    /*
    3. In Java create a Collection that contains at least five String objects.
            a. Then create a method that write each String object from the collection into a textfile.
    */
    public static void main(String[] args) {


        //  private static String method(String file_path)



        ArrayList<String> fruit = new ArrayList<>();

        fruit.add("mango"); // 0
        fruit.add("apple");
        fruit.add("coconut");
        fruit.add("banana");
        fruit.add("orange");


        System.out.println("LINES : \n" + fruit);

        File writerDestination = new File("C:\\Lexicon_JavaTraining\\Exercise\\File_Output\\Output.txt");
        write(writerDestination, fruit);


    }

    public static void write(File destination, List fruit) {
        try (FileWriter writer = new FileWriter(destination)) {
            if (!destination.exists()) {
                destination.createNewFile();
            }
            writer.write(String.valueOf(fruit));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
