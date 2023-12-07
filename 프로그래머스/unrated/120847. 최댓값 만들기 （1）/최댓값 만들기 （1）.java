import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;        
        int size = numbers.length;
        
        Arrays.sort(numbers);
        
        return numbers[size-1]*numbers[size-2];
    }
}