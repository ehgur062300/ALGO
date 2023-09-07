class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int y = x;
        while(true){
            sum += y%10;
            y /= 10;
            if(y == 0){ break; }
        }
        
        if(x % sum != 0){ return false; }
        return answer;
    }
}