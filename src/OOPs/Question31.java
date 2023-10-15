package OOPs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question31 {
//    Write a program that attempts to open a non-existent file using the FileReader class.
//    Handle the "FileNotFoundException" and print an error message.
public static void main(String[] args) {
    try{
        FileReader fileReader = new FileReader("Great");
        int data = fileReader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fileReader.read();
        }

    }catch (FileNotFoundException e){
        System.err.println("file not found");
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}
