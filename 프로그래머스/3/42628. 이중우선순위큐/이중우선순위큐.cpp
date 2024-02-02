#include <string>
#include <vector>
#include <map>

using namespace std;

vector<int> solution(vector<string> operations) {
    vector<int> answer;
    map<int,int> m;
    
    for(string s : operations){
        if(s == "D -1"){
            if(!m.empty()){
                m.erase(m.begin());
            }
        }else if(s == "D 1"){
            if(!s.empty()){
                int size = m.size();
                m.erase(m.rbegin()->first);
            }
        }else{
            int num = stoi(s.replace(0,2,""));
            m[num]=1;
        }
    }
    
    int mx=0;
    for(auto it : m){
        mx = it.first;
    }
    answer.push_back(mx);
    answer.push_back(m.begin()->first);
    return answer;
}