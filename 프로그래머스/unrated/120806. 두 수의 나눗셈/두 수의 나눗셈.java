class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        float n1 = num1;
        float n2 = num2;
        float r = n1/n2;
        
        answer = (int)(r*1000);
        return answer;
    }
}