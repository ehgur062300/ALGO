import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int max = arr[arr.length-1];
        
        for(int i=1; ; i++){
            int num = max*i;
            boolean io = true;
            for(int j=0; j<arr.length; j++){
                if(num%arr[j] != 0){ 
                    io = false; 
                    break;
                }
            }
            if(io){ return num; }
        }
    }
}