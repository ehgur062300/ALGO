import java.util.*;

class Solution {
    public int[] solution(String[] strlist) {
        List<Integer> result = new ArrayList<>();
        for(String str : strlist){
            result.add(str.length());
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}