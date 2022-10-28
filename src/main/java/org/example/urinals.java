package org.example;

import java.io.*;

/* Author Manoj Dara */
public class urinals {
    public  String readInput(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        System.out.println(bufferedReader.readLine());
        return bufferedReader.readLine();
    }
    public static void main(String[] args) throws IOException {
    urinals urinals = new urinals();
        urinals.readInput("urinals.dat");
    }
}
