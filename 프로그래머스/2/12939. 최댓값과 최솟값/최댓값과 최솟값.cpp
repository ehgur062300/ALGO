#include <string>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

string solution(string s) {
    string answer = "";
    vector<int> v;
    
    string temp = "";
    for(char c : s){
        if(c == ' '){
            v.push_back(stoi(temp));
            temp = "";
            continue;
        }
        temp += c;
    }
    v.push_back(stoi(temp));
    
    sort(v.begin(), v.end());
    answer = to_string(v[0])+" "+to_string(v.back());
    return answer;
}