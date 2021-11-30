package Programmers.Level1;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        if(participant.length == 1){
            answer = participant[0];
            return answer;
        }

        for(int i = 0; i < participant.length; i++){
            answer = participant[i];
            for(int j = 0; j < completion.length; i++){
                if(participant[i] == completion[j]){
                    break;
                }
            }
        }

        return answer;
    }
}