#include <string>
#include <algorithm>

using namespace std;

string solution(string new_id) {
    
    transform(new_id.begin(), new_id.end(), new_id.begin(), ::tolower);
   
    string temp =  "";
    for(char c: new_id) {
        if(isalpha(c) || isdigit(c) || c == '-' || c == '_' || c == '.') {
            temp += c;
        }
    }
    new_id = temp;
    temp = "";
    

    for(char c: new_id) {
        if(c == '.' && temp.back() == '.') continue;
        temp += c;
    }
    new_id = temp;
    temp = "";

    if(new_id.front() == '.') new_id.erase(0, 1);
    if(new_id.back() == '.') new_id.pop_back();
    

    if(new_id.empty()) new_id = "a";
  
    if(new_id.length() >= 16) new_id.erase(new_id.begin()+15, new_id.end());
    if(new_id.back() == '.') new_id.pop_back();
    
    while(new_id.length() < 3) {
        new_id += new_id.back();
    }
    
    return new_id;
}