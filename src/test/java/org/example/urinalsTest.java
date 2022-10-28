package org.example;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    public void readInputTestForEmptyFile(){
        System.out.println("===== Manoj Dara == TEST ONE EXECUTED =====");
        urinals urinals =  new urinals();
        File file = new File("urinals.dat");
        boolean actual = false;
        if(urinals.readInput(file) == "") actual = true;
        boolean expected = false;
        assertEquals(expected,actual,"Should return Empty String");
    }

}