package tutorial;

public class tutorial1 {
    public static int function1(int number, int k){  //약수 중 k번째로 작은 약수 구하기
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                k--;
                if(k == 0){
                    return i;
                }
            }
        }
        return -1;
    }

    public static char function2(String input){  //문자열의 마지막 단어
        return input.charAt(input.length() - 1);
    }

    public static int max(int a, int b){  //최대값 찾기
        return (a > b) ? a : b;
    }

    public static int function3(int a, int b, int c){
        int result = max(a, b);
        result = max(result, c);
        return result;
    }

    public static int function4(int a, int b, int c){
        int min;
        if(a > b){
            if(b > c){
                min = c;
            }
            else{
                min = b;
            }
        }
        else{
            if(a < c){
                min = a;
            }
            else{
                min = c;
            }
        }
        for(int i = min; i > 0; i--){
            if(a % i == 0 && b % i == 0 && c % i == 0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        /*
        int result = function1(3050, 10);
        if(result == -1){
            System.out.println('x');
        }
        else{
            System.out.println(result);
        }*/
        System.out.println(function2("Hello Worl"));
        System.out.println(function3(789, 567, 345));
        System.out.print(function4(400, 300, 750));
    }
}
