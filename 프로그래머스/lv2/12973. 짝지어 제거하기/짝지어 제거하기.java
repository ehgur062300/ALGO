import java.util.*;

class Solution{
    public int solution(String s){
        Stack<Character> stack = new Stack<>();
        Stack<Character> recycle = new Stack<>();
        
        for(int i=s.length()-1; i>=0; i--){
            stack.push(s.charAt(i));
        }
        
        while(!stack.empty()){
            char cur = stack.pop();
            
            if(recycle.empty()){ recycle.push(cur); }
            else{
                if(recycle.peek() == cur){
                    recycle.pop();
                } else{
                    recycle.push(cur);
                }
            }
        }
        
        if(recycle.empty()){ return 1; }
        return 0;
    }
}