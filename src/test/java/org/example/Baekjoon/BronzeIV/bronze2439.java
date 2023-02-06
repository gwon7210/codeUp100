package org.example.Baekjoon.BronzeIV;

import org.junit.Test;

import java.util.Scanner;


public class bronze2439 {

    @Test
    public void print(){

        int test_value1 = 5 ;

        for(int i=5; i>0; i--){
            for(int k = i-1 ; k >0; k--){
                System.out.print(" ");
            }
            for(int j=0; j<6-i; j++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
