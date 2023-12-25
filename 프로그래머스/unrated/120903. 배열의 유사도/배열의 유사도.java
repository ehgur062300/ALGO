import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        Map<String,Integer> m1 = new HashMap();
        
        for(String s : s2){m1.put(s,1);}
        
        for(String s : s1){
            if(m1.containsKey(s)){
                answer++;
            }
        }
        return answer;
    }
}