package org.example;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if(N < 1000000){

            for(int i=0; i<N; i++){
                StringTokenizer tokenizer = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(tokenizer.nextToken());
                int b = Integer.parseInt(tokenizer.nextToken());

                bw.write(a+b +"\n");
            }

        }else{
            System.out.printf("최대 1,000,000이다");
        }

        bw.flush();
        bw.close();
     }
}