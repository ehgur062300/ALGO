import java.util.*;

class Solution {
        
    public long solution(long n) {
        long answer = 0;
        String N = Long.toString(n);
        
        String [] str = N.split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        N = "";
        
        for(String a : str){
            N += a;
        }
        
        answer = Long.parseLong(N);
        
        return answer;
    }
}