package Algorithm;

import java.io.IOException;

class Graph{    
    private int N;  //노드 수
    private int map[][];  //노드간 가중치 저장할 배열
    private int dist[];
    private boolean visited[];
    private int INF = Integer.MAX_VALUE;

    public Graph(int N){
        this.N = N;
        map = new int[N + 1][N + 1];
    }

    public void input(int i, int j, int w){
        map[i][j] = w;
        map[j][i] = w;
    }

    public void dijkstra(int v){
        dist = new int[N + 1];  //최단 거리를 저장
        visited = new boolean[N + 1];  //방문 여부를 저장
        //dist 초기화
        for(int i = 1; i <= N; i++){
            dist[i] = INF;
        }
        dist[v] = 0;  //시작노드 초기화
        visited[v] = true;  //시작노드는 이미 방문
        //연결 노드 dist 갱신
        for(int i = 1; i <= N; i++){
            if((visited[i] == false) && map[v][i] != 0){
                dist[i] = map[v][i];
            }
        }
        
        for(int i = 0; i < N - 1; i++){
            //원래는 모든 노드가 true될때까지 인데
            //노드가 n개 있을 때 다익스트라를 위해서 반복수는 n-1번이면 된다.
            //원하지 않으면 각각의 노드가 모두 true인지 확인하는 식으로 구현해도 된다.
            int min = INF;
            int min_index = -1;

            for(int j = 1; j <= N; j++){
                if(!visited[j] && (dist[j] != INF)){
                    if(dist[j] < min){
                        min = dist[j];
                        min_index = j;
                    }
                }
            }

            visited[min_index] = true;

            for(int k = 0; k <= N; k++){
                if(!visited[k] && map[min_index][i] != 0){
                    if(dist[k] > dist[min_index] + map[min_index][k]){
                        dist[k] = dist[min_index ] +map[min_index][k];
                    }
                }
            }
        }

        for(int i = 1; i <= N; i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println("");
    }
}

public class Dijkstra {  //벨만은 너무 느림 O(n^3), 다익스트라는 좀 더 똑똑 O(n^2 * logn)
    //모든 노드들을 INF로 초기화 후 시작 노드는 0으로 초기화
    /*
    s = 0  첫 노드
    dist = [0, INF, INF, ...]  최단 경로의 길이
    parent = [None, ..., None]  종착점의 바로 직전 노드들
    Q = min_heap with dist[v]의 keys  Q가 heap
    while(Q가 비어있을 때까지) :
        u = Q.deleteMin()  dist가 최소인 것 고름 = u
        for each u -> v :  u의 인접 노드에 대해
            relax(u, v)
            Q.decreaseKey(v, dist[v]) in Q
    return dist, parent
    */
    //각 노드는 삽입과 삭제를 함 -> O(nlogn)
    //각 엣지(E개)는 한번의 relax를 한다 -> 한번의 decreaseKey를 한다는 것과 같음
    //-> 이 말은 heapify_up을 하는 것 -> O(Elogn) -> O(n^2 * logn)
    //만약 fibonacci heap을 사용한다면 heapify_up이 O(n^2) -> 최종 빅오는 O(n^2)로 가장 빠름


    public static void main(String[] args) throws IOException{
        Graph g = new Graph(8);
        g.input(1, 2, 3);
        g.input(1, 5, 4);
        g.input(1, 4, 4);
        g.input(2, 3, 2);
        g.input(3, 4, 1);
        g.input(4, 5, 2);
        g.input(5, 6, 4);
        g.input(4, 7, 6);
        g.input(7, 6, 3);
        g.input(3, 8, 3);
        g.input(6, 8, 2);
        g.dijkstra(1);
    }
}
