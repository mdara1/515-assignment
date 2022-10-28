package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Author Manoj Dara */
public class urinals {
    public  List<String> readInput(String fileName) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        while((line = bufferedReader.readLine()) != null){
            list.add(line);
        }
        bufferedReader.close();
        return list;
    }
    public List<Integer> countUrinals(List<String> list) {
        List<Integer> result  = new ArrayList<>();
        for (Object o : list) {
            String string = o.toString();
            int counter = 0;
            StringBuilder str = new StringBuilder(string);
            for (int i = 0; i < string.length(); i++) {
                if (i < str.length() - 1) {
                    if (str.charAt(i) == '1' && str.charAt(i + 1) == '1') {
                        counter = -1;
                        break;
                    }
                }
                if (str.charAt(i) == '0') {
                    if (i == 0) {
                        if (str.charAt(i + 1) == '0') {
                            str.setCharAt(i, '1');
                            counter++;
                        }
                    } else if (i == string.length() - 1) {
                        if (str.charAt(i - 1) == '0') {
                            str.setCharAt(i, '1');
                            counter++;
                        }
                    } else {
                        if (str.charAt(i - 1) == '0' && str.charAt(i + 1) == '0') {
                            str.setCharAt(i, '1');
                            counter++;
                        }
                    }
                }
            }
            result.add(counter);
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
    urinals urinals = new urinals();
    System.out.println(urinals.countUrinals(urinals.readInput("urinals.dat")));
    }
}
