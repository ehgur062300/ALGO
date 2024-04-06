import java.util.*;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        
        int len = number.length()-k;
        for(int i=0,idx = -1; i<len; i++){
            char max = '0';
            for(int j=idx+1; j<=k+i; j++){
                if(max < number.charAt(j)){
                    max = number.charAt(j);
                    idx = j;
                    if(max == '9'){ break; }
                }
            }
            answer += max;
        }
        return answer;
    }
}