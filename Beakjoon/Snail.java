package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int day = (V - B) / (A - B);
        
        if((V - B) % (A - B) != 0){
            day++;
        }

        System.out.println(day);
    }
}


/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine(), " ");

int A = Integer.parseInt(st.nextToken());
int B = Integer.parseInt(st.nextToken());
int V = Integer.parseInt(st.nextToken());

int day = 1;
int sum = 0;

if(A >= V){
    System.out.println(day);
}
else{
    while(sum <= V){
        if(sum + A >= V){
            break;
        }
        sum = sum + A - B;
        day++;
    }
    System.out.println(day);
}
*/