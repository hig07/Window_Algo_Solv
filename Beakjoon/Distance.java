package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Distance {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int A = Integer.parseInt(br.readLine());

        for(int i = 0; i < A; i++){
            st = new StringTokenizer(br.readLine(), " ");

            long x = Long.parseLong(st.nextToken());  //현재 출발 지점
            long y = Long.parseLong(st.nextToken());  //도착 지점

            long distance = y - x;  //남은 거리 1이 되기 전까지의 남은 거리

            int max = (int)Math.sqrt(distance);

            if(max == Math.sqrt(distance)){
                sb.append(2 * max - 1).append('\n');
            }
            else if(distance <= max * max + max){
                sb.append(2 * max).append('\n');
            }
            else{
                sb.append(2 * max + 1).append('\n');
            }
        }
        System.out.println(sb);
    }
}
