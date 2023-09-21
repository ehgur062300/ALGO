class Solution {
    public int solution(int n) {
        int first = 0, second = 1;
        
        return fivo(n, first, second);
    }
    private int fivo(int n, int a, int b){
        n--;
        int next = (a + b)%1234567;
        if(n == 1){ return next; }
        return fivo(n, b, next);
    }
    
}