package com.stackroute.pe3;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringComparisonTest
{
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        stringComparision = new StringComparision();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        stringComparision = null;

    }
    @Test
    public void isDuplicateSameArrayTest()
    {
        StringComparison s=new StringComparison ();
        String a[]={"two","four"};
        String exp[]={"two","four"};
        s.isDuplicate1 ( a,a.length );
        assertArrayEquals( exp,a );
    }
    @Test
    public void idDuplicateDiffListTest()
    {
        StringComparison s=new StringComparison ();
        String a[]={"two","four"};
        String b[]={"two","three"};
        String exp="Duplicate Presents";
        String res=s.isDuplicate2 ( a,b );
        assertEquals( exp,res );
    }
    @Test
    public void idDuplicateDiffListDiffValuesTest()
    {
        StringComparison s=new StringComparison ();
        String a[]={"two","four"};
        String b[]={"Five","three"};
        String exp="No Duplicates";
        String res=s.isDuplicate2 ( a,b );
        assertEquals( exp,res );
    }
    @Test
    public void appendFirst()
    {
        StringComparison s=new StringComparison ();
        String[] array1 = { "a" , "b" , "c" , "d" , "e"};
        String[] array2 = { "f" , "g" , "h" , "i" , "j"};
        String[] actual = s.appendFirstElement(array1, array2);
        String[] expected = { "a" , "f" , "g" , "h" , "i" , "j"};
        //This method checks the actual output with expected output.
        assertArrayEquals(expected, actual);
    }

    @Test
    public void PrependMid()
    {
        StringComparison s=new StringComparison ();
        String[] array1 = { "a" , "b" , "c" , "d" , "e"};
        String[] array2 = { "f" , "g" , "h" , "i" , "j"};
        String[] actual = s.prependMidElement(array1, array2);
        String[] expected = { "h" , "a" , "b" , "c" , "d" , "e"};
        //This method checks the actual output with expected output.
        assertArrayEquals(expected, actual);
    }
}