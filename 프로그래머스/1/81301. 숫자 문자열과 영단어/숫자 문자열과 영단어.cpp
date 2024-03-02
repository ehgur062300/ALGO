#include <string>
#include <vector>
#include <unordered_map>
using namespace std;

int solution(string s) {
    string answer = "";
    unordered_map<string,char> m;
    
    m["zero"] = '0';
    m["one"] = '1';
    m["two"] = '2';
    m["three"] = '3';
    m["four"] = '4';
    m["five"] = '5';
    m["six"] = '6';
    m["seven"] = '7';
    m["eight"] = '8';
    m["nine"] = '9';
    
    string temp = "";
    for(char c : s){
        if(int(c) > 47 && int(c) < 58){
            answer += c;
        } else {
            temp += c;
            if(m.find(temp) != m.end()){
                answer += m[temp];
                temp = "";
            }
        }
    }
    
    return stoi(answer);
}