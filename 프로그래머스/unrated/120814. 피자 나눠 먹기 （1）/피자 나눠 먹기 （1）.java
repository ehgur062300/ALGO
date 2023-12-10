class Solution {
    public int solution(int n) {
        int answer = n/7;
        if(answer <= 1){return 1;}
        if(n%7 > 0){return answer+1;}
        return answer;
    }
}