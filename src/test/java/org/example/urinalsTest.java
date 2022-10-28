package org.example;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    public void readInputTestForEmptyFile() throws IOException {
        System.out.println("===== Manoj Dara == TEST ONE EXECUTED =====");
        urinals urinals =  new urinals();
        String fileName = "urinals.dat" ;
        boolean actual = Objects.equals(urinals.readInput(fileName), null);
        boolean expected = true;
        assertEquals(expected,actual,"Should return Empty String");
    }

}