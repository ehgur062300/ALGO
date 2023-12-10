class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        
        for(int n:num_list){
            answer[n%2]++;
        }
        return answer;
    }
}