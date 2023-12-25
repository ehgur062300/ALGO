import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        Set<String> hs = new HashSet<>(List.of(s2));
        
        for(String s : s1){
            if(hs.contains(s)){
                answer++;
            }
        }
        return answer;
    }
}