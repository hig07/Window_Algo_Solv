package Algorithm;
import java.util.Arrays;

class Solution1 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];  //결과 값이 commands 배열의 길이와 같다

        for (int i = 0; i < commands.length; i++){
            int[] tmpArr = new int[commands[i][1] - commands[i][0] + 1];  //tmpArr의 길이는 i - j + 1과 같다
            int idx = 0;
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++){
                tmpArr[idx] = array[j];  //tmpArr 배열에 array의 j 번째 원소를 삽입
                idx++;
            }
            Arrays.sort(tmpArr);  //정렬

            answer[i] = tmpArr[commands[i][2] - 1];  //tmpArr의 k 번째 수
        }
        return answer;
    }
}