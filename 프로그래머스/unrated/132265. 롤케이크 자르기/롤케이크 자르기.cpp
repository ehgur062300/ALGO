#include <string>
#include <vector>
#include <map>

using namespace std;

int solution(vector<int> topping) {
    int answer = 0;
    int t = topping.size();
    map<int,int> s, t_cnt;
    
    for(int i=0; i<t; i++){ t_cnt[topping[i]]++; }
    
    while(!topping.empty()){
        int temp = topping.back();
        topping.pop_back();
        s[temp]++; 
        t_cnt[temp]--;
        if(t_cnt[temp] == 0){ t_cnt.erase(temp); }
        if(t_cnt.size() == s.size()){
            answer++;
        }
    }
    
    return answer;
}