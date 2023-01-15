package org.example.기초입출력;

import org.junit.Test;


public class code15 {

    @Test
    public void print(){

        int test_value = 75254;

        String[] arr = String.valueOf(test_value).split("");

        for(int i=0; i<arr.length; i++) {
            System.out.printf(arr[i]);
            for(int k=arr.length-i-1; k>0; k--){
                System.out.print("0");
            }
            System.out.println("");
        }
    }
}
