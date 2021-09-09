package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
		
        int A = Integer.parseInt(br.readLine());
        int[][] comp_arr = new int[A][2];

        for(int i = 0; i < A; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            comp_arr[i][0] = x;
            comp_arr[i][1] = y;
        }

        for(int i = 0; i < A; i++){
            int cnt = 1;
            for(int j = 0; j < A; j++){
                if(i == j){
                    continue;
                }
                if(comp_arr[i][0] < comp_arr[j][0] && comp_arr[i][1] < comp_arr[j][1]){
                    cnt++;
                }
            }
            sb.append(cnt).append(" ");
        }
        System.out.println(sb);
    }
}

/*
System.out.println();
(x, y), (p, q)라고 할 때 x > p 그리고 y > q 이라면 우리는 A의 덩치가 B의 덩치보다 "더 크다"
*/