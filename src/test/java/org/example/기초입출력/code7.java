package org.example.기초입출력;

import org.junit.Test;

import java.util.Scanner;


public class code7 {

    @Test
    public void print(){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0; i < 3; i++) {
            System.out.printf("%d ",a);
        }    }
}