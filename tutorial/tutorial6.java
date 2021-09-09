package tutorial;

public class tutorial6 implements Dog, Cat{  //인터페이스 사용시 implements, 추상클래스 사용시 extends
    //추상클래스보다 인터페이스가 더 체계적인 설계 가능, 추상화 정도가 높음
    //인터페이스 사용시 다중 상속 가능, 추상클래스는 불가능
    public static void main(String[] args){
        tutorial6 main = new tutorial6();
        main.crying();
        main.show();
    }

    @Override
    public void crying() {
        System.out.println("Bow Wow");
    }

    @Override
    public void show() {
        System.out.println("Hello Wolrd");        
    }
}
