package Algorithm;

public class Kruskal {  //MST 대표 알고리즘, MST는 트리 알고리즘
    //MST 성질 중 cycle property 성질 이용
    //cycle property : 임의의 사이클을 잡았을 때 그 사이클의 엣지 중 가장 weight가 큰
    //즉, 비용이 가장 큰 엣지를 포함히는 MST는 존재하지 않는다
    //임의의 사이클의 최대 비용 에지는 MST에 포함되지 않는다
    //최대 비용 에지는 해당 MST에서 제거하여 두 개의 서브트리로 나뉨
    //대신 사이클에 포함된 다른 에지(두 트리를 연결시킬)를 집어넣음
    //귀류법 사용
    //0. MST = {}
    //1. 에지를 비용의 오름차순으로 정렬 -> O(mlogm)
    //2. 비용이 가장 작은 에지부터 고려(비용이 같을 때는 고려 순서 상관없다) -> for문은 m번 진행
    /*
    for 각 에지 e = (u, v) :
        if MST v{e} has no cycle : (MST에 에지 e를 더했더니 사이클이 없다면) -> 사이클 체크 진행이 c번
            MST = MST v{e}
        if 절대값(MST) == n - 1 : (MST에 들어가 있는 것이 n - 1 개라면)
            break (트리가 완성된 것)
    사이클 체크 과정은 union-find 자료구조 사용
    find와 union은 각각 O(logn) 시간이 걸림
    결과적으로 2번은 O(c*m) -> O(nlogn)
    */
    //3. return MST

    //sudo code
    /*
    Kruskal(V, E) :
        T = []  //MST
        for each v in V : //모든 노드 V 집합 중 노드 v에 대해서
            make_set(v)  //자기 자신으로 구성된 집합을 하나씩 만듬 -> O(1)
        //엣지들을 비용에 대해 오름차순으로 정렬
        sort E in non-decreasing order of weights -> O(mlogm)
        for each e = (u, v) in E :  //가장 작은 비용의 엣지부터 확인 -> m번
            if find(u) != find(v) :  //T와 {e} 사이에 사이클이 있는지 확인
                T.append(e)  //사이클이 없으면 엣지를 추가
                union(find(u), find(v))  #union-find -> find, union이 총 5번 -> O(5logn)
            if T == n - 1  //T의 배열에 모든 엣지(n - 1개)가 들어왔다면
                break  //n - 1개가 되면 굳이 더 체크할 필요 없음
        return T
    */
}
