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
    public void writeOutput(List<Integer> list) throws IOException {
        File path = new File(".");
        String fileName = "rule";
        File [] files = path.listFiles();
        assert files != null;
        for (File file : files) {
            if (file.isFile() && file.toString().startsWith("./" + fileName)) {
                fileName = file.toString().replace("./", "");
                break;
            }
        }
        String fileToWriteTo;
        if(fileName.equals("rule")) fileToWriteTo = "rule.txt";
        else{
            File oldFile = new File(fileName);
            System.out.println(oldFile.delete());
            int start = fileName.indexOf("e");
            int end = fileName.indexOf(".");
            String subString = fileName.substring(start + 1, end);
            if(subString.isEmpty()) fileToWriteTo = "rule1.txt";
            else{
                int count = Integer.parseInt(subString);
                count = count+1;
                fileToWriteTo = "rule" + count +".txt";
            }
        }
        System.out.println("Writing to File " +fileToWriteTo);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileToWriteTo));
        for (Integer integer : list) {
            bufferedWriter.write(integer.toString() + "\n");
        }
        bufferedWriter.close();
    }
    public static void main(String[] args) throws IOException {
    urinals urinals = new urinals();
    System.out.println(urinals.countUrinals(urinals.readInput("urinals.dat")));
    urinals.writeOutput(urinals.countUrinals(urinals.readInput("urinals.dat")));
    }
}
