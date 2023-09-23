import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String s = "";

        for(int i=0; i<n; i++){
            s = Integer.toBinaryString((arr1[i] | arr2[i]));
            s = s.replaceAll("0"," ");
            s = s.replaceAll("1","#");

            answer[i] = s;
            while (answer[i].length() < n) {
                answer[i] = ' ' + answer[i];
            }
        }
        return answer;
    }
}