package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            deq.offer(i + 1);
        }

        while(deq.size() > 1){
            deq.poll();
            deq.offerLast(deq.peek());
            deq.poll();
        }
        
        System.out.println(deq.peek());
    }
}
