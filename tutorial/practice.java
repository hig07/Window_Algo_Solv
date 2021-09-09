package tutorial;

import java.util.Scanner;

//묵시적 타입 변환(자동 타입 변환)
/*
double num1 = 10;
int num2 = 3;
double num3 = 7.0f + 3.14;
*/
//명시적 타입 변환(강제 타입 변환)
/*
int num1 = 1, num2 = 4;
double result2 = (double) num1 / num2;
*/
//do / while 문은 조건식의 결과와 상관없이 무조건 한 번은 루프를 실행합니다.
public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("영어 한 문자 : ");
        //스캐너는 스트링만 가능 -> charAt(index) 필요
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':        
            case 'e':        
            case 'i':        
            case 'o':        
            case 'u':        
                System.out.println("해당 문자는 소문자 모음입니다.");        
                break;        
            case 'A':        
            case 'E':        
            case 'I':        
            case 'O':        
            case 'U':        
                System.out.println("해당 문자는 대문자 모음입니다.");        
                break;        
            default:        
                System.out.println("해당 문자는 모음이 아닙니다.");        
                break;        
        }  
        sc.close();      
    }
}

/*
public class practice{
    public static void main(String[] args){
    }
}
*/
/*
public class practice{
    public static void main(String[] args){
    }
}
*/
/*
public class practice{
    public static void main(String[] args){
    }
}
*/
/*
public class practice{
    public static void main(String[] args){
    }
}
*/
/*
public class practice{
    public static void main(String[] args){
    }
}
*/
/*
public class practice{
    public static void main(String[] args){
    }
}
*/
/*
public class practice{
    public static void main(String[] args){
    }
}
*/
/*
public class practice{
    public static void main(String[] args){
    }
}
*/