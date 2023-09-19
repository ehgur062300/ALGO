import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zeroCnt = 0, beforeLen = 0, afterLen = 0;
        
        int cnt = 0;
        while(!s.equals("1")){
            beforeLen = s.length();
            s = s.replace("0", "");
            afterLen = s.length();
            
            zeroCnt += beforeLen - afterLen;
            
            s = Integer.toBinaryString(afterLen);
            cnt++;
        }
        answer[0] = cnt;
        answer[1] = zeroCnt;
        
        return answer;
    }
}