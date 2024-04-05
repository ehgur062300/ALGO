import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String,Integer> m = new HashMap<>();
        
        for(String[] str : clothes){
            if(m.containsKey(str[1])){
                m.put(str[1],m.get(str[1])+1);
            } else {
                m.put(str[1],1);   
            }
        }
        
        Iterator<String> it = m.keySet().iterator();
        while(it.hasNext()) {
            answer *= (m.get(it.next())+1);
        }
        
        return --answer;
    }
}