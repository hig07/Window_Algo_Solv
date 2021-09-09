package Algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Node{  //트리의 노드 정보를 저장할 클래스 구조체 
    int data;  //노드 값 
    Node left;  //왼쪽 자식 노드 참조 값 
    Node right;  //오른쪽 자식 노드 참조 값 

    //추가할 때 참조되는 왼쪽, 오른쪽 자식의 값은 모르니까 일단 data 값을 기반으로 Node 객체 생성
    Node(int data){
        this.data = data;
    }
}

public class Binary_tree_traversal {
    /*
    이진트리 표현법 1. 배열, 리스트(heap) 2. 노드와 링크 직접 표현
    이진 트리 탐색은 매우 효율적, 효율을 위해 포인터 사용
    완전 이진 트리가 아니라면 배열 사용 힘듦 (노드가 오른쪽으로 치우쳐지면 불필요한 공간이 많이 생김)
    이것을 없애기 위해 포인터 사용
    전위 순회 : 자기 자신 먼저 처리 -> 왼 -> 오
    중위 순회 : 왼 -> 자신 -> 오
    후위 순회 : 왼 -> 오 -> 자신
    순회에는 재귀가 필요
    */

    public Node root;  //초기 root는 null

    public void createNode(int data, int leftData, int rightData){
        if(root == null){  //초기 상태 - 루트 노드 생성 
            root = new Node(data);
            //좌우 값이 있는 경우, 즉 -1이 아닌 경우 노드 생성 
            if(leftData != -1){
                root.left = new Node(leftData);  //왼쪽 자식 노드 값을 가지는 Node 인스턴스 생성
            }
            if(rightData != -1){
                root.right = new Node(rightData);  //오른쪽 자식 노드 값을 가지는 Node 인스턴스 생성
            }
        }
        //초기 상태가 아니라면, 루트 노드 생성 이후 만들어진 노드 중 어떤건지를 찾아야함
        else{
            searchNode(root, data, leftData, rightData);
        }
    }

    //매개변수로 들어온 root노드를 시작으로 data와 같은 값을 가진 node를 찾는다. 
	//찾을 때까지 root노드에서 부터 왼쪽, 오른쪽으로 내려감 
    public void searchNode(Node node, int data, int leftData, int rightData){
        if(node == null){  //도착한 노드가 null이면 재귀 종료 - 찾을(삽입할) 노드 X
            return;
        }
        else if(node.data == data){  //들어갈 위치를 찾았다면 
            if(leftData != -1){  //-1이 아니라 값이 있는 경우에만 좌우 노드 생성
                node.left = new Node(leftData);
            }
            if(rightData != -1){
                node.right = new Node(rightData);
            }
        }
        else{  //아직 찾지못했고 탐색할 노드가 남아 있다면
            searchNode(node.left, data, leftData, rightData);  //왼쪽 재귀 탐색
            searchNode(node.right, data, leftData, rightData);  //오른쪽 재귀 탐색
        }
    }

    public void preorder(Node node){
        if(node != null){
            System.out.print(node.data + " ");
            if(node.left != null){
                preorder(node.left);
            }
            if(node.right != null){
                preorder(node.right);
            }
        }
    }

    public void inorder(Node node){
        if(node != null){
            if(node.left != null){
                preorder(node.left);
            }
            System.out.print(node.data + " ");
            if(node.right != null){
                preorder(node.right);
            }
        }
    }

    public void postorder(Node node){
        if(node != null){
            if(node.left != null){
                preorder(node.left);
            }
            if(node.right != null){
                preorder(node.right);
            }
            System.out.print(node.data + " ");
        }
    }

    public void iterativeOrder(Node curr) {
        Stack<Node> stack = new Stack<>(); // 반복적 순회를 위한 스택 생성 
    
        //처음엔 루트 노드부터 시작 
        while (curr != null || !stack.isEmpty()) { 
            //현재 노드의 왼쪽 노드들을 null에 도달할 때까지(마지막 왼쪽 자식 노드까지) 스택에 추가한다. 
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } 
    
            //null 노드에 도달하면 스택에서 하나씩 삭제한다. 
            curr = stack.pop(); 
            System.out.print(curr.data + " "); //삭제된 노드 방문 -> 삭제된 노드의 값 출력 
    
            //삭제된 노드를 방문한 후에 이 노드의 오른쪽 노드로 이동한다.
            curr = curr.right;
            //다시 이 노드를 기준으로 왼쪽 노드들을 null에 도달할 때까지 스택에 추가한다.
            // -> 이를 스택이 빌 때까지 반복하면 이진트리를 중위순회할 수 있다.
        }
    }

    //레벨 순회한 결과 출력 
public void levelOrder(Node root) {
    ArrayList<ArrayList<Integer>> list = new ArrayList<>(); 
	Queue<Node> queue = new LinkedList<>();
	queue.offer(root);

	while(!queue.isEmpty()) {
        ArrayList<Integer> level = new ArrayList<>();

        int size = queue.size();
        for(int i = 0; i < size; i++) {
            Node node = queue.poll();
            level.add(node.data); 

		    if(node.left != null) queue.offer(node.left); // 왼쪽 자식 노드가 있다면 추가 
		    if(node.right != null) queue.offer(node.right); // 오른쪽 자식 노드가 있다면 추가 
        }
        list.add(level);
    }

    for (ArrayList<Integer> i : list) {
        System.out.println(i);
    }
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("트리 원소 수 : ");
        int n = sc.nextInt();
        
        Binary_tree_traversal bt = new Binary_tree_traversal();

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            bt.createNode(a, b, c);
        }

        System.out.println("전위 순회");
        bt.preorder(bt.root);
        
        System.out.println("\n중위 순회");
        bt.inorder(bt.root);
        
        System.out.println("\n후위 순회");
        bt.postorder(bt.root);

        sc.close();
    }
}
