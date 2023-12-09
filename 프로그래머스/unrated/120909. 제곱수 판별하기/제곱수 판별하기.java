import java.util.*;

class Solution {
    public int solution(int n) {
        double d_num = Math.sqrt(n);
        double i_num = Math.floor(d_num);
        
        if(d_num == i_num){return 1;}
        return 2;
    }
}