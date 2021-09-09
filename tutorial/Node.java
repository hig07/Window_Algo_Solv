package tutorial;

public class Node {
    private int x;  //프라이빗 -> 외부 접근 불가
    private int y;

    public int getX(){  //퍼블릭 -> 외부 접근 가능
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public Node(int x, int y){  //생성자(인스턴스)는 클래스 이름과 동일, 객체를 하나 만들어줄 때 자동으로 값을 초기화해주는 함수
        this.x = x;
        this.y = y;
    }
    public Node getCenter(Node other){  //함수 = 메소드
        return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
    }
}
