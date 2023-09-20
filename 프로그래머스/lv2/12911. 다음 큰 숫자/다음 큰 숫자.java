import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = trans(n), num = 0;
        
        answer = result(n,cnt);
        return answer;
    }
    private int result(int n, int n_cnt){
        int result_cnt = 0;
        
        while(true){
            n++;
            result_cnt = trans(n);
            if(result_cnt == n_cnt){ return n; }
        }
        
    }
    private int trans(int n){
        int cnt = 0;
        while(n > 0){
            if(n%2 == 1){ cnt++; }
            n /= 2;
        } 
        return cnt;
    }
}