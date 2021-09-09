package tutorial;

public class tutorial2 {
    public static int factorial1(int number){  //반복
        int sum = 1;
        for(int i = 2; i <= number; i++){
            sum *= i;
        }
        return sum;
    }

    public static int factorial2(int number){  //재귀
        if(number == 1){
            return 1;
        }
        else{
            return number * factorial2(number - 1);
        }
    }

    public static int fibonacci1(int number){  //반복
        int result = -1;
        int one = 1;
        int two = 1;

        if(number == 1){
            return one;
        }
        else if(number == 2){
            return two;
        }
        else{
            for(int i = 2; i < number; i++){
                result = one + two;
                one = two;
                two = result;
            }
            return result;
        }
    }

    public static int fibonacci2(int number){  //재귀
        if(number == 1){
            return 1;
        }        
        else if(number == 2){
            return 1;
        }
        else{
            return fibonacci2(number - 1) + fibonacci2(number - 2);
        }
    }

    public static void main(String[] args){
        System.out.println(factorial1(10));
        System.out.println(factorial2(10));
        System.out.println(fibonacci1(10));
        System.out.println(fibonacci1(10));
    }
}
