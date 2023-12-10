import java.util.*;
import java.util.stream.Collectors;


class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int num:array){
            if(num == n){
                answer++;
            }
        }
        
        
        
//         List<Integer> nums = 
//             Arrays.stream(array).boxed().collect(Collectors.toList());
        
//         answer = Collections.frequency(nums,n);
        return answer;
    }
}