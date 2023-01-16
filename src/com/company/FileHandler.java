package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileHandler {

    public static ArrayList<String> readFile() {
        ArrayList<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input file name: ");
        String fileName = sc.nextLine();
        sc.close();

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();

            while(line != null){
                String[] array = line.split(" ");

                words.addAll(Arrays.asList(array));
                line = br.readLine();
            }
        }catch (IOException exception){
            exception.printStackTrace();
            System.out.println("File not found, check the name of the file and ensure you have inputted the right extension of the file name");
        }
        return words;
    }
    public static void newFile(ArrayList<String> text){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String filename = sc.nextLine();

        try (PrintWriter fw = new PrintWriter(new FileWriter(filename))) {
            fw.println(text);
        }
    }
}