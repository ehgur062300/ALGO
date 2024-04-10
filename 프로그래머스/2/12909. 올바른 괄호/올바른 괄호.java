import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> st = new Stack<>();
        
        char c;
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            
            if(c == '('){
                st.push(c);
            
            } else {
                if(st.empty()){
                    return false;
                }
                if(st.peek() == c){
                    st.push(c);
                } else {
                    st.pop();
                }
            }
        } 
        
        if(st.empty()){
            return true;
        }

        return answer;
    }
}