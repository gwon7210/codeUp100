package org.example.기초입출력;

import org.junit.Test;


public class code17 {

    @Test
    public void print(){

        String test_value = "1996.14.6"; //"06.04.1996"

        String[] arr = test_value.split("\\.");

        while(arr[0].length() < 4){
            arr[0] = "0" + arr[0];
        }

        if(arr[1].length() == 1){
            arr[1] = "0" + arr[1];
        }

        if(arr[2].length() == 1){
            arr[2] = "0" + arr[2];
        }

        System.out.println(arr[2] + "." + arr[1] + "." + arr[0]);
    }
}
