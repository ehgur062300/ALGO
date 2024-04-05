import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        boolean[] flag = new boolean[n+2];
        List<Integer> chk_lost = new ArrayList<>();
        
        for(int r:reserve){
            flag[r] = true;
        }
        
        for(int l:lost){
            if(flag[l]){ 
                flag[l]=false; 
            } else{
                chk_lost.add(l);   
            }
        }
        Collections.sort(chk_lost);
        for(Integer i:chk_lost){
            if(flag[i-1]){
                flag[i-1] = false;
                continue;
                
            } else if(flag[i+1]){
                flag[i+1] = false;
                continue;
                
            } else {
                answer--;
            }
        }
        
        return answer;
    }
}