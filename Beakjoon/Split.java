package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Split {  //StringTokenizer or split 사용 가능(" "를 구분자로 사용)
    public static void main(String[] args) throws IOException{
        int count = 0;
        int pre_str = 32;	// 공백을 의미한다.
        int str ;

        while(true) {
            str = System.in.read();
            
            // 입력받은 문자가 공백일 때,
            if(str == 32) {
                // 이전의 문자가 공백이 아니면
                if(pre_str != 32) count++;
            }

            // 입력받은 문자가 개행일때 ('\n')
            else if(str == 10) {
                // 이전의 문자가 공백이 아니면
                if(pre_str != 32) count++;
                break;
            }    
            pre_str = str;        
        }

        System.out.println(count);
    }
}

//System.out.println();
/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String A = br.readLine();
int cnt = 0;

for(int i = 0; i < A.length(); i++){
    if(i > 0 && A.charAt(i) == ' '){
        if(i != A.length() - 1){
            cnt++;
        }
    }
}
System.out.println(cnt + 1);
 */
