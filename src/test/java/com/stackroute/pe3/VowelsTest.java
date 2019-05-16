package com.stackroute.pe3;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.stackroute.pe3.Vowels;

public class VowelsTest {

    private static Vowels vowels;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        vowels = new Vowels();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        vowels = null;

    }


    @Test
    public void testVowels() {
        String actual[] = vowels.getVowels(new String[]{"India", "Egypt", "America", "Indonesia"});
        assertEquals(new String[]{"Ind", "Egypt", "Amrc", "Indns"}, actual);
    }
}