package Algorithm;
import java.util.LinkedList;
import java.util.Queue;

class truck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        int weight_sum = 0;

        for(int w : truck_weights){
            while(true){
                if(queue.isEmpty()){
                    queue.offer(w);
                    answer++;
                    weight_sum += w;
                    break;
                }
                else if(weight_sum == bridge_length){
                    weight_sum -= queue.poll();
                }
                else{
                    if(weight_sum + w > weight){
                        answer++;
                        queue.offer(0);
                    }
                    else{        
                        queue.offer(w);
                        answer++;
                        weight_sum += w;   
                        break;             
                    }                    
                }
            }            
        }

        return answer + bridge_length;
    }
}