package Algorithm;

public class Union_Find {
    public static int[] parent = new int[10001];

    public static boolean isSameParent(int x, int y){
        x = find(x);
        y = find(y);

        if(x == y){
            return true;
        }
        else return false;
    }

    public static int find(int x){
        if(x != parent[x]){
            return parent[x] = find(parent[x]);
        }
        else{
            return x;
        }
    }

    public static void union(int x, int y){
        x = find(x);
        y = find(y);

        if(x > y){
            parent[x] = y;
        }
        else{
            parent[y] = x;
        }
    }
    
    public static void main(String[] args){
        for (int i = 1; i <= 8; i++){ 
            parent[i] = i; 
        } 

        union(1, 2); 
        union(2, 3); 

        System.out.println("1과 3은 연결되어 있나요? " + isSameParent(1, 3));
    }
}
