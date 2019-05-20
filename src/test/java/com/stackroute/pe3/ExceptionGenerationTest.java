package com.stackroute.pe3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExceptionGenerationTest {


    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        ExceptionGeneration obj=new ExceptionGeneration()

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        ExceptionGeneration = null;

    }

    @Test
    public void NegArrayTest(){
        int arr[]={2,4,1,8,3,9,10};
        String expected="NegativeArraySizeException";
        String result=obj.NegArray(arr);
        //This method checks the actual output with expected output.
        assertEquals(expected,result);

    }


    @Test
    public void IndexOutTest(){

        int arr[]={2,4,1,8,3,9};
        String expected="IndexOutOfBoundsException";
        String result=obj.IndexOut(arr);
        //This method checks the actual output with expected output.
        assertEquals(expected,result);
    }

    @Test
    public void NullPointTest() {

        String s = null;

        String expected = "NullPointerException";
        String result = obj.NullPoint(s);
        //This method checks the actual output with expected output.
        assertEquals(expected, result);
    }

}