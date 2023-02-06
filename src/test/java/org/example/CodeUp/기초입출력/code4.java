package org.example.CodeUp.기초입출력;

import org.junit.Test;

import java.util.Scanner;


public class code4 {

    @Test
    public void print(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + " " + b);
    }

}