package org.example.기초산술연산;

import org.junit.Test;

import java.util.Scanner;


public class code1 {

    @Test
    public void print(){

//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        char b = a.charAt(0); // 입력값 b에 대입

        char b = 'a';
        b += 1;//아스키 코드값 1증가
        System.out.println(b); //char형으로 출력
    }
}
