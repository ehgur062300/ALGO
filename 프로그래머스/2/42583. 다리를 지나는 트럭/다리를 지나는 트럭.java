import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
    
        Queue<Integer> q = new LinkedList<>();
        int idx=0, time=0, sum=0;
        
        while(true){
            if(idx == truck_weights.length){
                break;
            }
            
            if(q.isEmpty()){
                q.add(truck_weights[idx]);
                sum += truck_weights[idx];
                idx++;
                time++;
                continue;
                
            } else if(q.size() < bridge_length){
                if(sum + truck_weights[idx] <= weight){
                    q.add(truck_weights[idx]);
                    sum += truck_weights[idx];
                    idx++;
                    time++;
                    
                } else {
                    q.add(0);
                    time++;
                }
                continue;
                
            } 
            
            if(q.size() == bridge_length){
                sum -= q.poll();
            }
        }
    
        return time+bridge_length;
    }
}