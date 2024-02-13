#include <string>
#include <vector>
#include <unordered_map>

using namespace std;

vector<int> solution(vector<string> name, vector<int> yearning, vector<vector<string>> photo) {
    vector<int> answer;
    
    unordered_map<string,int> m;
    
    for(int i = 0; i < name.size(); i++){
        m[name[i]] = yearning[i];
    }
    
    int sum = 0;
    
    for(auto p : photo){
        for(string s : p){
            sum += m[s];
        }
        answer.push_back(sum);
        sum = 0;
    }
    
    return answer;
}