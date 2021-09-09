package Algorithm;
import java.util.LinkedList;
import java.util.Queue;

class printer_prac {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        int answer = 0;

        for(int i = 0; i < priorities.length; i++){
            queue.offer(priorities[i]);
        }

        while(!queue.isEmpty()){
            boolean flag = false;

            for(int i = 1; i < queue.size(); i++){
            	if(queue.peek() < (int)(queue.toArray()[i])) {
            		flag = true;
            		break;
            	}
            }

            if(flag){
                queue.offer(queue.poll());
                location--;

                if(location < 0){
                    location = queue.size() - 1;
                }
            }
            else{
                if(location == 0){
                    answer++;
                    queue.clear();
                }
                else{
                    queue.poll();
                    answer++;
                    location--;
                    if(location < 0){
                        location = queue.size() - 1;
                    }
                }
            }
        }
        
        return answer;
    }
}