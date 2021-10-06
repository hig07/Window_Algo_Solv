package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_Bracket {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine();
            if(str.equals(".")){
                break;
            }
            else{
                sb.append(check(str)).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static String check(String str){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char item = str.charAt(i);

            if(item == '(' || item == '['){
                stack.push(item);
            }
            else if(item == ')'){
                if(stack.empty() || stack.peek() != '('){
                    return "no";
                }
                else{
                    stack.pop();
                }
            }
            else if(item == ']'){
                if(stack.empty() || stack.peek() != '['){
                    return "no";
                }
                else{
                    stack.pop();
                }
            }
            else{
                continue;
            }
        }

        if(stack.empty()){
            return "yes";
        }
        else{
            return "no";
        }
    }
}
