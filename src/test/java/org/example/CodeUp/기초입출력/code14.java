package org.example.CodeUp.기초입출력;

import org.junit.Test;

import java.util.Arrays;


public class code14 {

    @Test
    public void print(){

        String test_value = "HELLO";

        String temp = String.valueOf(test_value);
        String[] arr = temp.split("");

        Arrays.stream(arr).forEach(System.out::println);
    }
}
