package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Queue_Basic {
    static Deque<Integer> deque = new ArrayDeque<>();
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        while(N-- > 0){
            st = new StringTokenizer(br.readLine(), " ");
            switch(st.nextToken()){
                case "push" :
                    sb.append(push(Integer.parseInt(st.nextToken()))).append('\n');
                    break;
                case "pop" :
                    sb.append(pop()).append('\n');
                    break;
                case "size" :
                    sb.append(size()).append('\n');
                    break;
                case "empty" :
                    sb.append(empty()).append('\n');
                    break;                    
                case "front" :
                    sb.append(front()).append('\n');
                    break;                
                case "back" :
                    sb.append(back()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
    public static int push(int n){
        deque.offer(n);
        return deque.peek();
    }
    public static int pop(){
        Integer result = deque.poll();
        if(result == null){
            return -1;
        }
        else{
            return result;
        }
    }
    public static int size(){
        return deque.size();
    }
    public static int empty(){
        if(deque.isEmpty()){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static int front(){
        Integer result = deque.peek();
        if(result == null){
            return -1;
        }
        else{
            return result;
        }
    }
    public static int back(){
        Integer result = deque.peekLast();
        if(result == null){
            return -1;
        }
        else{
            return result;
        }
    }
}
//push, pop, size, empty, front, back