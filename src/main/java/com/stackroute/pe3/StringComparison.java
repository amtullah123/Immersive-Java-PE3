package com.stackroute.pe3;

public class StringComparison {
    public String[] isDuplicate1 (String a[] , int len) {
        int flag = 1;
        for (int i = 0; i < len; ++i) {
            for (int j = i + 1; j < len; ) {
                if (a[i].equals ( a[j] ) == true) {
                    for (int t = j; t < len - 1; ++t) {
                        a[t] = a[t + 1];
                    }
                    len = len - 1;
                } else
                    j++;
            }
        }
        String e[] = new String[len];
        for (int i = 0; i < len; i++)
            e[i] = a[i];
        return e;
    }

    public String isDuplicate2 (String a[] , String b[])
    {
        int flag = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals ( b[i] )) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 1)
            return "Duplicate Presents";
        else
            return "No Duplicates";
    }
    //Append the first element of array1 to array2.
    public String[] appendFirstElement(String[] s1,String[] s2)
    {
        String[] result = new String[s2.length+1];
        result[0] = s1[0];
        int j=0;
        for (int i=1; i<result.length; i++)
        {
            result[i] = s2[j];
            j++;
        }
        return result;
    }


    //Prepend the mid element of array2 to array1.
    public String[] prependMidElement(String[] s1, String[] s2)
    {
        String[] result= new String[s1.length+1];
        int pos = s2.length/2,j=0;

        result[0] = s2[pos];

        for (int i=1; i<result.length; i++)
        {
            result[i]=s1[j];
            j=j+1;

        }
        return result;
    }//End of PrependMidElement
}