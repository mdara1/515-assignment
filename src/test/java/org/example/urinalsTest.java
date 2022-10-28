package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {

    @Test
    public void readInputTestForEmptyFile() throws IOException {
        System.out.println("===== Manoj Dara == TEST ONE EXECUTED =====");
        urinals urinals =  new urinals();
        String fileName = "urinals.dat" ;
        boolean actual = Objects.equals(urinals.readInput(fileName), null);
        boolean expected = true;
        assertEquals(expected,actual,"Should return Empty String");
    }

    @Test
    public void countUrinalsTest(){
        System.out.println("===== Manoj Dara == TEST TWO EXECUTED =====");
        urinals urinals = new urinals();
        String string = "1001";
        int expected = 0;
        assertEquals(expected,urinals.countUrinals(string), "Should return 0");
    }

}