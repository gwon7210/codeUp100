package org.example.Baekjoon.BronzeIV;

import org.junit.Test;

import java.util.Scanner;


public class bronze2439 {

    @Test
    public void print(){

        Scanner sc = new Scanner(System.in);

        int test_value1 = sc.nextInt();

        for(int i=test_value1; i>0; i--){
            for(int k = i-1 ; k >0; k--){
                System.out.print(" ");
            }
            for(int j=0; j<test_value1+1-i; j++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
