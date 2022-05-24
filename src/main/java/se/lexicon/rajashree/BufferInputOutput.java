package se.lexicon.rajashree;

import java.io.*;

public class BufferInputOutput {


/*
   4 Create a method that can copy a file using both BufferedInputStream and
      BufferedOutputStream.
 */
    public static void main(String[] args) {
    File source = new File("C:\\Lexicon_JavaTraining\\Exercise\\File_Input\\Input.txt");
    File destination = new File("C:\\Lexicon_JavaTraining\\Exercise\\File_Output\\Output1.txt");
    copy(source,destination);
}
    public static void copy(File source, File destination){
        try(
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destination))
        ){
            byte[] buffer = new byte[1024]; //Defining a buffer
            int bytesRead; //Number of bytes that were read AND how many bytes that were read into the buffer array
            while((bytesRead = in.read(buffer)) > 0){
                out.write(buffer, 0, bytesRead);
                out.flush(); //Forcing a write after each iteration
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}