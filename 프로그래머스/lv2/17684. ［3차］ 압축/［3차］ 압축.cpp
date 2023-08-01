#include <string>
#include <vector>
#include <map>

using namespace std;

vector<int> solution(string msg) {
    vector<int> answer;
    map<string,int> dict;
    
    int idx = 1;
    for(string i="A"; i<="Z"; i[0]++){
        dict[i] += idx;
        idx++;
    }
    
    string temp = "";
    for(int j=0; j<msg.size(); j++){
        temp += msg[j];
        if(!dict[temp]){
            dict[temp] += idx;
            string w = temp.substr(0, temp.size()-1);
            answer.push_back(dict[w]);
            temp.erase(0, temp.size()-1);
            idx++;
        }
    }
    answer.push_back(dict[temp]);
    return answer;
}