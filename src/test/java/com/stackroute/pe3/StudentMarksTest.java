package com.stackroute.pe3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentMarksTest {
    StudentMarks sc=new StudentMarks();

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        studentMarks = new StudentMarks();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        studentMarks = null;

    }

    @Test
    public void StudentsTest(){
        int numOfStudents=5;
        int[] arr={32,22,26,80,60};
        String expected="True";
        String actual=sc.Students(numOfStudents,arr);
        //This method checks the actual output with expected output.
        assertEquals(expected,actual);
    }

    @Test
    public void Students1Test(){
        int numOfStudents=5;
        int[] arr={32,22,108,80,60};
        String expected="Error:Input Should be less than 100";
        String actual=sc.Students(numOfStudents,arr);
        //This method checks the actual output with expected output.
        assertEquals(expected,actual);
    }

    @Test
    public void Students2Test(){
        int numOfStudents=5;
        int[] arr={32,22,26,-2,60};
        String expected="Error:Input should be greater than 0";
        String actual=sc.Students(numOfStudents,arr);
        //This method checks the actual output with expected output.
        assertEquals(expected,actual);
    }

}