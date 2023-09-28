import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int size : tangerine){
            map.put(size, map.getOrDefault(size, 0)+1);
        }
        
        List<Integer> keyList = new ArrayList<>(map.keySet());
        
        keyList.sort((o1,o2) -> map.get(o2) - map.get(o1));
        
        int i=0;
        while(k > 0){
            k -= map.get(keyList.get(i));
            answer++;
            i++;
        }
                    
        return answer;
    }
}