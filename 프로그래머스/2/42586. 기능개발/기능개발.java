import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Stack<Integer> t = new Stack<>();
        
        int task = 0;
        for(int i=0; i<progresses.length; i++){
            int day = (100-progresses[i])/speeds[i];
            if(speeds[i]*day+progresses[i] < 100){ day++; }
            
            if(t.empty()){ 
                t.push(day); 
                task++;
                continue;
            }
            else if(t.peek() >= day){
                task++;
                continue;

            } else {
                t.pop();
                t.push(day);
                answer.add(task);
                task=1;
            }        
        }
        if(task == 0){ answer.add(1); }
        else { answer.add(task); } 
        
        int[] result = new int[answer.size()];
        for(int i=0; i<answer.size(); i++){
            result[i] = answer.get(i);
        }
        
        return result;
    }
}