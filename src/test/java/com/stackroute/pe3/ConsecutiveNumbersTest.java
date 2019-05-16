package com.stackroute.pe3;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.pe3.ConsecutiveNumbers;

public class ConsecutiveNumbersTest {

    private static ConsecutiveNumbers consecutive;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        consecutive = new ConsecutiveNumbers();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        consecutive = null;

    }
    @Test
    public void testConsecutiveNumbers() {

        assertEquals(
                "find out if a series of 7 digits are consecutive numbers. For eg: 1,2,3,4,5,6,7",
                "consecutive", consecutive.getConsecutiveNumbers(new int[]{10,11,12,13,14,15,16,17}));
        assertEquals(
                "check is it non consecutive or not",
                "non consecutive", consecutive.getConsecutiveNumbers(new int[]{10,20,30,40,50,60}));
        assertEquals(
                "check reverse order",
                "consecutive", consecutive.getConsecutiveNumbers(new int[]{7,6,5,4,3,2,1}));
    }


}