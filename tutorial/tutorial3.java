package tutorial;

import java.util.Scanner;

public class tutorial3 {

    public static int max(int a, int b){
        return (a > b) ? a : b;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("배열 크기 입력 : ");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for(int i = 0; i < number; i++){
            System.out.println("정수 하나씩 입력 : ");
            array[i] = scanner.nextInt();
        }
        int result = -1;
        for(int i = 0; i < number; i++){
            result = max(result, array[i]);            
        }
        scanner.close();
        System.out.println(result);
    }
}
