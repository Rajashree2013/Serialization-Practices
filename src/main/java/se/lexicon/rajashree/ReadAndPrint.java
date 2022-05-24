package se.lexicon.rajashree;

import javax.sound.midi.Patch;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
/*
1. Create a textfile (.txt) and fill it with some text content. Tip: you can find random text here.
a. In Java create a method that read in a String from file and return the String using
FileReader.
 */
public class ReadAndPrint {
    public static void main(String[] args)
            throws IOException {

        Path filename = Path.of("C:\\Lexicon_JavaTraining\\Exercise\\File_Input\\Input.txt");

        String str = Files.readString(filename);
        System.out.println(str);

    }

}