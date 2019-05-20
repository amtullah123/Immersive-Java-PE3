package com.stackroute.pe3;

public class ExceptionGeneration {

    public String NegArray(int arr[]){
        String result="";

        try {
            for (int i = 0; i < arr.length; i++) {
                int[] num = new int[arr.length];
                num[i]=5;
            }
        }
        //it generates NegativeArraySizeException
        catch(NegativeArraySizeException e){
            result="NegativeArraySizeException";
        }
        result="NegativeArraySizeException";
        return result;

    } //end of NegArray

    public String IndexOut(int arr[]){
        String result="";

        try {
            for (int i = 0; i <=arr.length; i++) {
                int[] num = new int[arr.length];
                num[i]=5;
            }
        }
        //it generates IndexOutOfBoundsException
        catch(IndexOutOfBoundsException e){
            result="IndexOutOfBoundsException";
        }
        result="IndexOutOfBoundsException";
        return result;

    } //end of IndexOut

    public String NullPoint(String s){
        String result="";

        try {
            String a=s.toUpperCase();

        }
//it generates NullPointerException
        catch(NullPointerException e){
            result="NullPointerException";
        }
        result="NullPointerException";
        return result;

    } //end of NullPoint

}