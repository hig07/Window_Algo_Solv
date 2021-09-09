package Algorithm;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class DFS {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("정점 수 n : ");
        int n = scan.nextInt();
        System.out.print("간선 수 m : ");
        int m = scan.nextInt();
        System.out.print("시작 정점 v : ");
        int v = scan.nextInt();  // 탐색을 시작할 정점의 번호

        boolean visited[] = new boolean[n + 1];  // 방문 여부를 검사할 배열 

        LinkedList<Integer>[] list = new LinkedList[n + 1];

        for(int i = 0; i <= n; i++){
            list[i] = new LinkedList<Integer>();
        }

        // 두 정점 사이에 여러 개의 간선이 있을 수 있다.
		// 입력으로 주어지는 간선은 양방향이다.
        for(int i = 0; i < m; i++){
            int v1 = scan.nextInt();
            int v2 = scan.nextInt();

            list[v1].add(v2);
            list[v2].add(v1);
        }

        for(int i = 1; i <= n; i++){  // 방문 순서를 위해 오름차순 정렬
            Collections.sort(list[i]);
        }

        for(int i = 0; i <= n; i++){
            System.out.println(list[i]);
        }
        
        System.out.println("DFS - 인접리스트");
        dfs(v, list, visited);

        scan.close();
    }   
    // DFS - 인접리스트 - 재귀로 구현 
    public static void dfs(int v, LinkedList<Integer>[] list, boolean[] visited){
        visited[v] = true;  // 정점 방문 표시
        System.out.print(v + " ");  // 정점 출력

        Iterator<Integer> iter = list[v].listIterator();
        while(iter.hasNext()){
            int w = iter.next();
            if(!visited[w]){  // 방문하지 않은 정점이라면 
                dfs(w, list, visited);  // 다시 DFS
            }
        }
    }
}
