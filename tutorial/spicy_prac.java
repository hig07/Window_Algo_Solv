package tutorial;

import java.util.PriorityQueue;

class spicy_prac {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int s : scoville){
            heap.offer(s);
        }

        while(!heap.isEmpty()){
            if(heap.peek() >= K){
                break;
            }
            if(heap.size() < 2){
                return -1;
            }
            heap.offer(heap.poll() + (heap.poll() * 2));
            answer++;
        }

        return answer;
    }
}
/*
class spicy_prac {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Arrays.sort(scoville);
        int mix = 0;

        if(scoville.length == 2 && scoville[0] + (scoville[1] * 2) < K){
            return -1;
        }

        for(int i = 0; i < scoville.length; i++){
            mix = scoville[i] + (scoville[i + 1] * 2);
            scoville[i] = mix;
            scoville[i + 1] = scoville[i + 2];
            answer++;
            Arrays.sort(scoville);
            if(scoville[0] >= K){
                break;
            }
        }
        return answer;
    }
}

*/