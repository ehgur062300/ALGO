import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int size : tangerine){
            map.put(size, map.getOrDefault(size, 0)+1);
        }
        
        List<Integer> valueList = new ArrayList<>(map.values());
    
        Collections.sort(valueList, Collections.reverseOrder());
        
        for(int v:valueList){
            k -= v;
            answer++;
            if(k<=0){
                break;
            }
        }
                    
        return answer;
    }
}