#include <string>
#include <vector>

using namespace std;

int solution(string t, string p) {
    int answer = 0;
    int len = p.size();
    
    for(int i=0; i<=t.size()-len; i++){
        string temp = "";
        for(int j=i; j<i+len; j++){
            temp += t[j];
        }
        if(temp <= p){answer++;}
    }
    return answer;
}