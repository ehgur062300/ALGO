import java.util.*;

class Solution {
    public Integer[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        if(list.size() == 0){ list.add(-1); }
        
        int arrListSize = list.size();
        Integer [] answer = list.toArray(new Integer[arrListSize]);
        
        Arrays.sort(answer);
        return answer;
    }
}