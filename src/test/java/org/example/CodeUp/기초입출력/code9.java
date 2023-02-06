package org.example.CodeUp.기초입출력;

import org.junit.Test;

import java.util.Scanner;
import java.util.StringTokenizer;


public class code9 {

    @Test
    public void print(){

        String time = "1996.4.6";
        String[] arr = time.split("\\.");
        String ymd;
        for(int i =0; i<arr.length; i++) {

            if(i==0){
                ymd= arr[i]+"년";
            } else if (i==1) {
                if(Integer.valueOf(arr[i])<10){
                    ymd="0"+arr[i]+"월";
                }else{
                    ymd=arr[i]+"월";
                }
            }else{
                if(Integer.valueOf(arr[i])<10){
                    ymd="0"+arr[i]+"일";
                }else{
                    ymd=arr[i]+"일";
                }
            }

            System.out.print(ymd);
            ymd=null;
        }
        }
}