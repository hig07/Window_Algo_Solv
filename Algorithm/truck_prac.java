package Algorithm;
import java.util.LinkedList;
import java.util.Queue;

class truck_prac{
    public static void main(String[] args) {
        int[] truck_weights = {7, 4, 5, 6};
        int answer = 0;
        int weight_sum = 0;
        int bridge_length = 2;
        int weight = 10;
        Queue<Integer> queue = new LinkedList<>();

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

        System.out.println(answer + bridge_length);
        
        return;

    }
}