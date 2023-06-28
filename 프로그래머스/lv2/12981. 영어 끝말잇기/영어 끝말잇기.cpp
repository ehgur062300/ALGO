#include <string>
#include <vector>
#include <iostream>
#include <map>

using namespace std;

vector<int> solution(int n, vector<string> words) {
    vector<int> answer;
    map<string, int> m;
    int cnt = 0;
    int p = 0;
    bool io = false;
    char prev[1] = {};

    for(int i=0; i<words.size(); i++){
        p++;
        if(p > n){p=1; cnt++;}
        if(i != 0 && words[i][0] != prev[0]){
            io=true; cnt++; break;
        }
        if(m.find(words[i]) != m.end()){io=true; cnt++; break;}
        m.insert(pair<string, int>(words[i], 1));
        prev[0] = words[i][words[i].length()-1];
    }
    if(io){ 
        answer.push_back(p);
        answer.push_back(cnt);
    }
    else{
        answer.push_back(0);
        answer.push_back(0);
    }
    return answer;
}