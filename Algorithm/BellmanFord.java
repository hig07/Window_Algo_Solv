package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Edge{
    int u;
    int v;
    int val;

    public Edge(int u, int v, int val){
        this.u = u;
        this.v = v;
        this.val = val;
    }
}

public class BellmanFord {  //V, N : 정점 개수, E : 간선 개수
    //최단 경로 최대 크기는 절대값(N) - 1
    //d[T] <= d[S] + w[S, T]
    //T : 해당 간선이 도달하고자 하는 정점, S : 해당 간선의 시작점
    //w : 해당 간선의 가중치,  d : 시작점에서 해당 정점의 거리
    static int INF = Integer.MAX_VALUE;
	static int N, M;
	static Edge[] e;
	static int[] dist;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.print("정점 수 : ");
        N = Integer.parseInt(st.nextToken());  //정점 개수
        System.out.print("간선 수 : ");
        M = Integer.parseInt(st.nextToken());  //간선 개수

        e = new Edge[M];

        dist = new int[N + 1];
        // 1. 출발 노드 설정
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int val = Integer.parseInt(st.nextToken());

            e[i] = new Edge(u, v, val);
        }
        // 2. 최단거리 테이블 초기화
        for(int i = 1; i <= N; i++){
            dist[i] = INF;
        }

        if(bellmanford(1)){  // 음수 순환 존재하면 -1 출력 
            System.out.println(-1);
        }
        else{
            // 1번 노드를 제외한 다른 모든 노드로 가기 위한 최단거리 출력 
            for(int i = 2; i < N + 1; i++){
                if(dist[i] == INF){  // 도달할 수 없으면 -1 
                    System.out.println(-1);
                }
                else{  // 최단 거리 출력 
                    System.out.println(dist[i]);
                }
            }
        }
    }

    public static boolean bellmanford(int start){
        dist[start] = 0;

        // n번 반복 (음수 간선 순환 체크안하려면 n-1번 반복)
        for(int i = 1; i < N - 1; i++){
            // 매 반복마다 모든 간선을 확인
            for(int j = 0; j < M; j++){
                if(dist[e[j].u] == INF){
                    continue;
                }
                // 현재 간선을 거쳐서 다른 노드로 이동하는 거리가 짧은 경우 
                if(dist[e[j].v] > dist[e[j].u] + e[j].val){
                    dist[e[j].v] = dist[e[j].u] + e[j].val;
                    // n번째 라운드에서 값이 갱신된다면 음수 순환 존재 
                    if(i == N - 1){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
