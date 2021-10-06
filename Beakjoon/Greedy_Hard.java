package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy_Hard {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE;
        StringTokenizer sub = new StringTokenizer(br.readLine(), "-");

        while(sub.hasMoreTokens()){
            int result = 0;
            StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");

            while(add.hasMoreTokens()){
                result += Integer.parseInt(add.nextToken());
            }
            if(sum == Integer.MAX_VALUE){
                sum = result;
            }
            else{                
                sum -= result;
            }
        }
        System.out.println(sum);
    }
}

/*
-를 기준으로 수식을 나눔 -> 30 - 30 + 40 -50 => 30, 30+40, 50
그 후 + 기준으로 더함 -> 30, 70, 50
=> 모든 수를 -를 기준으로 합침 -> 30-70-50
*/