package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DP_Make_One {
    static int cnt = 0;
    static Integer[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;

        System.out.println(make_One(N));
    }
    public static int make_One(int N){
        if(dp[N] == null){
            if(N % 6 == 0){
                dp[N] = Math.min(make_One(N / 3), Math.min(make_One(N / 2), make_One(N - 1))) + 1;
            }            
            else if(N % 3 == 0){
                dp[N] = Math.min(make_One(N / 3), make_One(N - 1)) + 1;                
            }
            else if(N % 2 == 0){
                dp[N] = Math.min(make_One(N / 2), make_One(N - 1)) + 1;                      
            }
            else{
                dp[N] = make_One(N - 1) + 1;
            }
        }    
        return dp[N];
    }
}
