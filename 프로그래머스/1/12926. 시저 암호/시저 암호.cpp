#include <string>
#include <vector>

using namespace std;

string solution(string s, int n) {
    char lower[26] =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char upper[26] = 
{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    
    string answer = "";
    
    for(char c : s){
        if(c == ' '){
            answer += ' ';
        }else if(c > 96){
            answer += lower[(int(c)-97+n)%26];
        }else {
            answer += upper[(int(c)-65+n)%26];
        }
    }
    
    return answer;
}