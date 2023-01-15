package org.example;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        StringTokenizer st = new StringTokenizer(time, ":");
        int[] arr = new int[st.countTokens()];
        for(int i = 0; st.hasMoreTokens(); i++)
            arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(arr[0] + ":" + arr[1]);
    }
}