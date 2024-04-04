import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> m = new HashMap<>();
        
        for(String p:participant){
            if(m.containsKey(p)){ 
                m.put(p,m.get(p)+1);
            } else {
                m.put(p,1);
            }
        }
        
        for(String c:completion){
            m.put(c,m.get(c)-1);
            if(m.get(c)==0){
                m.remove(c);
            }
        }
        
        return m.entrySet().iterator().next().getKey(); 
    
    }
}