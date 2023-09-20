import java.util.*;

class Solution {
    public int solution(int n) {
        int cnt = Integer.bitCount(n);
        
        return result(n,cnt);
    }
    
    private int result(int n, int n_cnt){
        int result_cnt = 0;
        while(true){
            n++;
            result_cnt = Integer.bitCount(n);
            if(result_cnt == n_cnt){ return n; }
        }
        
    }
}