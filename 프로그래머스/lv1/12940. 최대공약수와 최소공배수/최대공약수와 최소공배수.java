class Solution {
        
    public int[] solution(int n, int m) {
        int gcd = gcd(n,m);
        int lcm = (n * m)/gcd;
        
        int [] answer = {gcd, lcm};
        return answer;
    }
    
    private int gcd(int a, int b){
        if(a % b == 0){
            return b;
        }
        return gcd(b, a%b);
    }
}