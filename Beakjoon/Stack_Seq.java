package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_Seq {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int flag = 0;

        while(n-- > 0){
            int k = Integer.parseInt(br.readLine());

            if(k > flag) {
				for(int i = flag + 1; i <= k; i++) {
					stack.push(i);
					sb.append("+").append('\n');
				}
				flag = k;
			}
			else if(stack.peek() != k) {
				System.out.println("NO");
				System.exit(0);
			}			
			stack.pop();
			sb.append("-").append('\n');
        }

        System.out.println(sb);
    }
}
//System.out.println(stack.peek());
/*
입력 n까지 오름차순으로 스택에 넣음
넣는 도중 arr[i]와 일치할때 까지 push 일치하면 pop
마지막 숫자까지 넣고 pop 도중 arr의 순서와 맞지 않다면 NO
n번 만큼 이행 후 스택이 비어있지 않다면 NO
*/