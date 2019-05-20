package com.stackroute.pe3;

import java.util.Scanner;
import java.lang.String;

public class ConsecutiveNumbers {
    public String getConsecutiveNumbers(int[] queryString){
        String s1="consecutive";
        String s2="non consecutive";
        boolean result1=true;
        //this statement checks for consecutive nos
        result1=checkConsecutive(queryString);
        if(result1==true) {
            return s1;
        }
        else return s2;
    }
    public static boolean checkConsecutive(int[] queryString){

        boolean result=true;
        int size=queryString.length;
        for(int i=0;i<size-1;i++)
        {
            if(((queryString[i+1]-queryString[i])!=1) &&((queryString[i]-queryString[i+1])!=1))
            {
                return false;
            }
        }
        return true;

    }


}