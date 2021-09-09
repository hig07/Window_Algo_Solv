package Algorithm;

import java.util.Arrays;

class SolutionH {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        int cnt;

        //H-INDEX는 H번 이상 인용된 논문이 H개 이상일 때, H의 최대 값
        for(int i = 0; i < citations.length; i++){
            cnt = citations.length - i;

            if(citations[i] >= cnt){
                answer = cnt;
                break;
            }
        }

        return answer;
    }
}