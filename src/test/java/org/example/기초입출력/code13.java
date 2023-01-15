package org.example.기초입출력;

import org.junit.Test;

import java.util.Scanner;


public class code13 {

    @Test
    public void print(){

        double test_value = 123.45678;

        String temp = String.valueOf(test_value);
        String[] arr = temp.split("\\.");

        System.out.println("정수 : "+arr[0]);
        System.out.println("실수 : "+arr[1]);
    }
}
