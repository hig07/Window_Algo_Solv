package Algorithm;
class SolutionPL {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] strArr = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            strArr[i] = Integer.toString(numbers[i]);
        }

        for(int j = 0; j < numbers.length; j++){
            String p = strArr[j];
            for(int k = 0; k < numbers.length - 1; k++){
                if(Integer.parseInt(strArr[j] + strArr[k + 1]) < Integer.parseInt(strArr[k + 1] + strArr[j])){
                    strArr[j] = strArr[k+1];
                    strArr[k+1] = p;
                }
            }
        }

        for(int l = 0; l < numbers.length; l++){
            answer = answer + strArr[l];
        }

        return answer;
    }
}