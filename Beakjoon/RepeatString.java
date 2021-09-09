package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RepeatString {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        //StringTokenizer st;

        for(int i = 0; i < A; i++){
            String[] str = br.readLine().split(" ");

            int B = Integer.parseInt(str[0]);
            
            String s = str[1];

            for(int j = 0; j < s.length(); j++){
                for(int k = 0; k < B; k++){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }          
    }
}

//System.out.println();