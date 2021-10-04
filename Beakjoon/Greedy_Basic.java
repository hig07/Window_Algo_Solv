package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy_Basic {
    static int[] arr;
    static int N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(exchange(K));
    }
    public static int exchange(int K){
        int result = 0;

        for(int i = N - 1; i >= 0; i--){
            if(K >= arr[i]){
                result += K / arr[i];
                K = K % arr[i];
            }
        }
        return result;
    }
}

//System.out.println(K);