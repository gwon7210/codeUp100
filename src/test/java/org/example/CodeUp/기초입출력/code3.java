package org.example.CodeUp.기초입출력;

import org.junit.Test;

import java.util.Scanner;


public class code3 {

    @Test
    public void print(){
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        System.out.printf("%.6f", x);
    }

}