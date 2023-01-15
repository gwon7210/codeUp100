package org.example.기초입출력;

import org.junit.Test;

import java.util.Scanner;


public class code5 {

    @Test
    public void print(){
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        char y = sc.next().charAt(0);
        System.out.printf("%s %s", y, x);
    }

}