import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer,Integer> m = new HashMap<>();
        
        for(int num : nums) {
            if(m.containsKey(num)){
                m.put(num,m.get(num));
            }else {
                m.put(num,1);
            }
        }
        if(nums.length/2 > m.size()) {
            answer = m.size();
        } else {
            answer = nums.length/2;
        }
        
        return answer;
    }
}