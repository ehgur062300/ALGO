import java.util.*;

class Solution {
    public int solution(int n) {
        int compareNum = n+1;
        int trueBitCnt = Integer.bitCount(n);
        while(true){
            if(Integer.bitCount(compareNum) == trueBitCnt){ 
                return compareNum; 
            }
            compareNum++;
        }
    }
}