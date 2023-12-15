class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(slice > n){
            return 1;
        }else if(n%slice == 0){
            return n/slice;
        }
        return n/slice+1;
    }
}