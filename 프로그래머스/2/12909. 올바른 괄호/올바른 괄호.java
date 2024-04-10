import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> st = new Stack<>();
        char c;
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            if(st.empty()){
                if(c == ')'){
                    return false;
                } 
                st.push(c);
                continue;    
            }
            
            if(st.peek() == c){
                st.push(c);
            } else {
                st.pop();
            }
        } 
        
        if(st.empty()){
            return true;
        }

        return answer;
    }
}