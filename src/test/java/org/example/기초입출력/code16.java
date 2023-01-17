package org.example.기초입출력;

import org.junit.Test;


public class code16 {

    @Test
    public void print(){

        String test_value = "17:23:57";

        String[] arr = test_value.split(":");

        System.out.println(arr[1]);

    }
}
