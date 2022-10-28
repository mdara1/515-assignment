package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {

    @Test
    public void readInputTestForEmptyFile() throws IOException {
        System.out.println("===== Manoj Dara == TEST ONE EXECUTED =====");
        urinals urinals =  new urinals();
        String fileName = "urinalsEmpty.dat" ;
        List<String> fileContent,emptyList = new ArrayList<>();
        fileContent = urinals.readInput(fileName);
        emptyList.add("1");
        emptyList.remove(0);
        boolean actual = Objects.equals(fileContent, emptyList);
        boolean expected = true;
        assertEquals(expected,actual,"Should return Empty String");
    }

    @Test
    public void countUrinalsTestTwo(){
        System.out.println("===== Manoj Dara == TEST TWO EXECUTED =====");
        urinals urinals = new urinals();
        List<String> list = new ArrayList<>();
        list.add("10001");
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertEquals(expected,urinals.countUrinals(list), "Should return 1");
    }
    @Test
    public void countUrinalsTestThree(){
        System.out.println("===== Manoj Dara == TEST THREE EXECUTED =====");
        urinals urinals = new urinals();
        List<String> list = new ArrayList<>();
        list.add("1001");
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        assertEquals(expected,urinals.countUrinals(list), "Should return 0");
    }

}