package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCounter extends FileHandler {

    public static int countWords() {
        ArrayList<String> words = FileHandler.readFile();
        return words.size();
    }
}
