package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.assertArrayEquals;

public class ReversearrayTest
{
    Reversearray af;

    @BeforeClass
    public void setup()
    {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        af = new Reversearray();
    }

    @AfterClass
    public void tearDown()
    {
        //This method runs, after running all the test cases
            // This method is used to clear the initialized variables
        af = null;
    }

    @Test
    public void evenOddTest() throws Exception
    {

        int[] arr = {4, 3, 7, 8};
        String[] result = af.evenOdd(arr);
        String[] expected = {"even", "odd", "odd", "even"};
        //This method checks the actual output with expected output.
        assertArrayEquals(expected, result);

    }
    @Test
    public void reversearrayTest() throws Exception
    {

        int[] arr = {4, 3, 7, 8,4};
        int [] result = af.reversearray(arr);
        int [] expected = {4,8,7,3,4};
        //This method checks the actual output with expected output.
        assertArrayEquals(expected, result);

    }
    @Test
    public void removePrimeTest() throws Exception
    {
        int[] arr = {3, 12, 7, 8};
        int[] result = af.removePrime(arr);
        int[] expected = {12,8};
        //This method checks the actual output with expected output.
        assertArrayEquals(result, expected);

    }
}