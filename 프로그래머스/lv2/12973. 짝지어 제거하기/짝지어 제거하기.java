import java.util.*;

class Solution{
    public int solution(String s){
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(stack.empty()){ stack.push(c); }
            else{
                if(stack.peek() == c){
                    stack.pop();
                } else{
                    stack.push(c);
                }
            }
        }
        if(stack.empty()){ return 1; }
        return 0;
    }
}