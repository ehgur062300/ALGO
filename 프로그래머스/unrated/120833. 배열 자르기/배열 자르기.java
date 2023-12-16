import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int [] answer = {};
        answer = Arrays.stream(numbers, num1, num2+1).toArray();
        
        // int len = num2-num1+1;
        // int[] answer = new int[len];
        // for(int i=0; i<len; i++){
        //     answer[i] = numbers[i+num1];
        // }
        return answer;
    }
}