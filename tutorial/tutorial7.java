package tutorial;

import java.util.Scanner;

public class tutorial7 {  //다형성
    //사용자가 입력하는 값에 따라 인스턴스 값을 바꿀 수 있는 것이 다형성 장점
    //완전히 다른 인스턴스 값을 넣어주는 것
    //Fruit이 부모 클래스
    //바나나와 복숭아가 자식
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("바나나는 1, 복숭아는 2 : ");
        int input = scan.nextInt();
        if(input == 1){
            Fruit fruit = new Banana();  //클래스를 인스턴스화
            fruit.show();
        }
        else if(input == 2){
            Fruit fruit = new Peach();
            fruit.show();
        }
        else{
            System.out.println("Error");
        }
        scan.close();
    }
}
