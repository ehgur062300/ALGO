import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        
        Arrays.sort(people);
        
        for(int w:people){ dq.add(w); }
        
        int idx = 0;
        while(!dq.isEmpty()){
            int back = dq.pollLast();
            if(dq.isEmpty()){ return ++answer; }
            if(dq.getFirst() + back <= limit){
                answer++;
                dq.remove();
            } else {
                answer++;
            }
        }
        
        return answer;
    }
}