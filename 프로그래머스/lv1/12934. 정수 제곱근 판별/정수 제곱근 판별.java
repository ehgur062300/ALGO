class Solution {
    public long solution(long n) {
        long answer = -1;
        double sq = Math.sqrt(n); 
        if(sq == Math.floor(sq)){ 
            return Double.valueOf(Math.pow(sq+1,2)).longValue(); 
        }
        return answer;
    }
}