import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        boolean io = true; // [짝수 : true / 홀수 : false]
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){ 
                io = true; 
                answer += " ";
            } else{
                if(io){
                    answer += Character.toUpperCase(s.charAt(i));
                    io = false;
                } else{
                    answer += Character.toLowerCase(s.charAt(i));
                    io = true;
                }
            }
        }
        return answer;
    }
}