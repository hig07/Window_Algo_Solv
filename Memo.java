public class Memo {
    public static void main(String[] args){
        String s = "qwer";
        String answer = "";
        int tmp = s.length() / 2;
        
        if(s.length() % 2 == 0){
            answer = s.substring(tmp - 1, tmp + 1);
        }
        else{
            answer = s.substring(tmp, tmp + 1);
        }
        
        System.out.println(answer);
    }
}
