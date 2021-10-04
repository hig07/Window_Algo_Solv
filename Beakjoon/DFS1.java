package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DFS1 {
    public static StringBuilder sb = new StringBuilder();
    public static boolean[] visited;
    public static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N];
        arr = new int[M];
        dfs(N, M, 0);
        System.out.println(sb);
    }    
    public static void dfs(int N, int M, int depth){
        if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
        for(int i = 0; i < N; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i + 1;  //// 해당 깊이를 index로 하여 i + 1 값 저장
                dfs(N, M, depth + 1);  //// 다음 자식 노드 방문을 위해 depth 1 증가시키면서 재귀호출
                visited[i] = false;  //// 자식노드 방문이 끝나고 돌아오면 방문노드를 방문하지 않은 상태로 변경
            }
        }
    }
}