package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Apartment {
    public static int[][] arr = new int[15][15];   

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        make_APT();
        int A = Integer.parseInt(br.readLine());

        for(int i = 0; i < A; i++){            
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            sb.append(arr[k][n]).append('\n');
        }
        System.out.println(sb);        
    }

    public static void make_APT(){

        for(int i = 0; i < 15; i++){
            arr[i][1] = 1;  // i층 1호
            arr[0][i] = i;  // 0층 i호
        }

        for(int i = 1; i < 15; i++){
            for(int j = 2; j < 15; j++){
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
    }
}
/*
0 : 1 2 3 4 5 6 7
1 : 1 3 6 10 15 21 
2 : 1 4 10
*/