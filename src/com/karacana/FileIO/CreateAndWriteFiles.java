package com.karacana.FileIO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateAndWriteFiles {

    public static void main(String[] args){
        try {
            File file = new File("fileName.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file);

            printWriter.write("This is my file content ");
            printWriter.println(1000);
            printWriter.close();

            System.out.println("Done");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
