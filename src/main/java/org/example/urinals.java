package org.example;

import java.io.*;

/* Author Manoj Dara */
public class urinals {
    public  String readInput(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line= bufferedReader.readLine();
        bufferedReader.close();
        System.out.println(line + " input string");
        return line;
    }
    public int countUrinals(String string) {
        int counter = 0;
        StringBuilder str = new StringBuilder(string);
        for (int i = 0; i < string.length(); i++) {
            if(i<str.length()-1) {
                if (str.charAt(i) == '1' && str.charAt(i + 1) == '1') return -1;
            }
            if (str.charAt(i) == '0') {
                if (i == 0) {
                    if (str.charAt(i + 1) == '0') {
                        str.setCharAt(i, '1');
                        counter++;
                    }
                }
                else if (i == string.length() - 1) {
                    if (str.charAt(i - 1) == '0') {
                        str.setCharAt(i, '1');
                        counter++;
                    }
                }
             else {
                if (str.charAt(i - 1) == '0' && str.charAt(i + 1) == '0') {
                    str.setCharAt(i, '1');
                    counter++;
                }
            }
        }
    }
       return counter;
    }
    public static void main(String[] args) throws IOException {
    urinals urinals = new urinals();
    System.out.println(urinals.countUrinals(urinals.readInput("urinals.dat")));
    }
}
