import java.util.*;

class Solution {
    public String solution(String phone_number) {
        char [] ch = phone_number.toCharArray();
        int len = phone_number.length();
        
        for(int i=0; i<len-4; i++){
           ch[i] = '*';
        }
        
        return String.valueOf(ch);
    }
}