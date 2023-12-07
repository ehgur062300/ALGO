import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int x = a%2;
        int y = b%2;
        
        if(x+y == 2){
            return (a*a+b*b);
        }else if(x+y == 1){
            return 2*(a+b);
        }else{
            return Math.abs(a-b);
        }
    }
}