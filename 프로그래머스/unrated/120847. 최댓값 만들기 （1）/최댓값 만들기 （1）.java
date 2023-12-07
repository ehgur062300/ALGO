import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;        
        List<Integer> numList = new ArrayList<>();
        
        for(int n : numbers){
            numList.add(n);
        }
        
        Collections.sort(numList);
        Collections.reverse(numList);
        
        return numList.get(0)*numList.get(1);
    }
}