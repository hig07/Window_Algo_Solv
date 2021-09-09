package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordStudy {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        int[] arr = new int[26];

        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) >= 'a'){
                arr[A.charAt(i) - 97]++;
            }
            else{
                arr[A.charAt(i) - 65]++;
            }
        }

        int max = 0;
        char ch = '?';

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                ch = (char)(i + 65);
            }            
            else if(arr[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}

/*
public static void main(String[] args) throws IOException {
 
    int[] arr = new int[26]; // 영문자의 개수는 26개임

    int c = System.in.read();

    while (c > 64) {	// 공백을 입력받는 순간 종료됨 
        
        if (c < 91) {
            arr[c - 65]++;
        } else {
            arr[c - 97]++;
        }
        c = System.in.read();
    }


    int max = -1;
    int ch = -2;	// ? 는 63 이다.

    for (int i = 0; i < 26; i++) {

        if (arr[i] > max) {
            max = arr[i];
            ch = i;
        } else if (arr[i] == max) {
            ch = -2;
        }
    }
    System.out.print((char) (ch+65));
}
*/