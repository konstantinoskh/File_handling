package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public static ArrayList<String> readFile() {
        ArrayList<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input file name: ");
        String fileName = sc.nextLine();

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();

            while(line != null){
                words.add(line);
                line = br.readLine();
            }
        }catch (IOException exception){
            exception.printStackTrace();
            System.out.println("File not found, check the name of the file and ensure you have inputted the right extension of the file name");
        }
        return words;
    }
}