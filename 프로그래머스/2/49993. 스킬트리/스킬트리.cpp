#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(string skill, vector<string> skill_trees) {
    int answer = 0;
    
    for(string str : skill_trees){
        string temp = "";
        bool io = true;
        for(char c : str){
            if(skill.find(c) == string::npos){ continue; }
            temp += c;
        }
        
        for(int i=0; i<temp.length(); i++){
            if(skill[i] != temp[i]){ io = false; }
        }
        if(io){ answer++; }
    }
    
    return answer;
}