package org.example;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    public void readInputTestForEmptyFile(){
        System.out.println("===== Manoj Dara == TEST ONE EXECUTED =====");
        urinals urinals =  new urinals();
        File file = new File("urinals.dat");
        boolean actual = Objects.equals(urinals.readInput(file), " ");
        boolean expected = true;
        assertEquals(expected,actual,"Should return Empty String");
    }

}