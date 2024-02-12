#include <string>
#include <vector>
#include <unordered_map>

using namespace std;

vector<string> solution(vector<string> players, vector<string> callings) {
    vector<string> answer = players;
    unordered_map<string,int> m;
    unordered_map<string,int>::iterator it;
    
    int rank = 0;
    for(auto s : players){
        m[s] = rank++;
    }
    
    it = m.begin();
    for(auto s : callings){
        string temp = answer[m[s]-1];
        answer[m[s]-1] = s;
        answer[m[s]] = temp;
        m[temp]++;
        m[s]--;
    }
    
    return answer;
}