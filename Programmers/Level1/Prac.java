package Programmers.Level1;

public class Prac {
    public static void main(String[] args){
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        String answer = "";

        if(participant.length == 1){
            System.out.println(answer);            
        }

        for(int i = 0; i < participant.length; i++){
            answer = participant[i];
            for(int j = 0; j < completion.length; i++){
                if(participant[i] == completion[j]){
                    break;
                }
            }
        }
    }
}
