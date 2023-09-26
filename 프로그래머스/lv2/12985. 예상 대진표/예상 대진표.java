import java.util.*;

class Solution {
    public int solution(long n, int a, int b){
        int answer = 1;
        
        while(true){
            a = (a+1)/2;
            b = (b+1)/2;
            
            if(a == b){ return answer; }
            answer++;
        }
    }
}