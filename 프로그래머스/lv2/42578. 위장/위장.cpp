#include <string>
#include <map>
#include <vector>

using namespace std;

int solution(vector<vector<string>> clothes) {
    int answer = 1;
 
    map<string, int> m;
    map<string, int>::iterator it;
    
    for(int i=0; i<clothes.size(); i++){
        m[clothes[i][1]]++;
    }
    
    for(it=m.begin(); it != m.end(); it++){
        answer *= it->second+1;
    }
    
    return answer-1;
}