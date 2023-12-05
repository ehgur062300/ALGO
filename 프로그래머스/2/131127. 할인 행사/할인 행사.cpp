#include <iostream>
#include <string>
#include <vector>
#include <unordered_map>
using namespace std;

int solution(vector<string> want, vector<int> number, vector<string> discount) {
    int answer = 0;
    unordered_map<string, int> m;
    unordered_map<string, int> dm;
    unordered_map<string, int>::iterator it;
    
    for(int i = 0; i < want.size(); i++){
        m[want[i]] = number[i];   
    }
    
    for(int i=0; i<10; i++){
        dm[discount[i]]++;
    }
    if(dm == m){answer++;}
    
    for(int i=10; i<discount.size(); i++){
        dm[discount[i]]++;
        dm[discount[i-10]]--;
        if(dm[discount[i-10]]==0){
            it = dm.find(discount[i-10]);
            dm.erase(it);
        }
        if(dm == m){answer++;}
    }
  

    return answer;
}