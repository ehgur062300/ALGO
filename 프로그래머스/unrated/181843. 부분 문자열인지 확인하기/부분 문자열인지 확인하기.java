class Solution {
    public int solution(String my_string, String target) {
        String test = my_string.replace(target,"");
        if(my_string.equals(test)){
            return 0;
        }
        
        return 1;
    }
}