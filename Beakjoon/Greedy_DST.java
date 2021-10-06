package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy_DST {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] cost = new long[N];
        long[] dist = new long[N - 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N - 1; i++){
            dist[i] = Long.parseLong(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
            cost[i] = Long.parseLong(st.nextToken());
        }

        long lowest = Long.MAX_VALUE;
        long result = 0L;

        for(int i = 0; i < N - 1; i++){
            if(cost[i] < lowest){
                lowest = cost[i];
            }
            result += (lowest * dist[i]);
        }

        System.out.println(result);
    }
}
