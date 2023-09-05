class Solution {
    public int[] solution(long n) {
        String N = Long.toString(n);
        int[] answer = new int[N.length()];
        
        int idx = 0;
        for(int i=N.length()-1; i>=0; i--){
            answer[idx++] = N.charAt(i) - '0';
        }
        return answer;
    }
}