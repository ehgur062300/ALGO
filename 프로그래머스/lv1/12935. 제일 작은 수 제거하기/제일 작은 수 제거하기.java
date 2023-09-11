import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();
        
        int min_num = arr[0];
        for(int i=1; i<arr.length; i++){
            min_num = Math.min(min_num, arr[i]);
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] != min_num){ result.add(arr[i]); }
        }
        
        if(result.size() == 0){ result.add(-1); }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}