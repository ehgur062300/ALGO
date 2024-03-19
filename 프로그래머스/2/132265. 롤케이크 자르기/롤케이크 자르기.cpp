#include <string>
#include <vector>
#include <map>
#include <set>

#include <iostream>

using namespace std;

int solution(vector<int> topping) {
    int answer = 0;
    map<int,int> m;
    set<int> s;
    
    for(int t : topping){ m[t]++; }
    // 1:4 | 2:2 | 3:1 | 4:1
    
    while(topping.size()>1){
        int temp = topping.back(); topping.pop_back();
        
        m[temp]--;
        if(m[temp] == 0){ m.erase(temp); }
        
        s.emplace(temp);
        
        if(s.size() == m.size()){
            answer++;
        }
    }
    
    return answer;
}