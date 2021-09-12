package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sort_Word {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st;
        StringBuilder sb = new StringBuilder();
		
        int A = Integer.parseInt(br.readLine());
        String[] arr = new String[A];

        for(int i = 0; i < A; i++){
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, (s1, s2) -> {
            if(((String) s1).length() == ((String) s2).length()){
                return s1.compareTo(s2);
            }
            else{
                return s1.length() - s2.length();
            }
        });

        sb.append(arr[0]).append('\n');

        for(int i = 1; i < A; i++){
            if(!arr[i].equals(arr[i - 1])){
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}

/*
Arrays.sort(arr, new Comparator<String>() {		
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);	// 사전 순 정렬
                }
                // 그 외의 경우
                else {
                    return s1.length() - s2.length();
                }
            }
        });
        13
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours
*/
