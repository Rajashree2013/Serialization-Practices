package se.lexicon.rajashree;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;


/*
2.Create a textfile (.txt) and fill it with lines of names.
a. In Java create a method that read in the lines into a Collection of your choice using
BufferedReader. One line for each element in the Collection.
 */
public class FileReadLine {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        FileReadLine fileReadLine  = new FileReadLine();
        lines = fileReadLine.readFileLines ("C:\\Lexicon_JavaTraining\\Exercise\\File_Input\\Input.txt");
        System.out.println("LINES : \n"+ lines);
    }
     public ArrayList<String> readFileLines (String filepath)
             throws IOException {
            File fp = new File(filepath);
            FileReader fr = new FileReader(fp);
            BufferedReader br = new BufferedReader(fr);
            ArrayList<String> lines = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

            fr.close();
            return lines;
        }


    }



