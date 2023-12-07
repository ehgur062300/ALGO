import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> nums = new ArrayList<>();
        
        for(int num : num_list){
            nums.add(num);
        }
        Collections.reverse(nums);
        return nums.stream().mapToInt(i -> i).toArray();
    }
}