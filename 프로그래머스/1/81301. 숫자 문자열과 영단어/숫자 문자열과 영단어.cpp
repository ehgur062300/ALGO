#include <string>
#include <vector>
// #include <unordered_map>
#include <regex>

using namespace std;

int solution(string s) {
    string answer = s;
    // unordered_map<string,char> m;
    
//     m["zero"] = '0';
//     m["one"] = '1';
//     m["two"] = '2';
//     m["three"] = '3';
//     m["four"] = '4';
//     m["five"] = '5';
//     m["six"] = '6';
//     m["seven"] = '7';
//     m["eight"] = '8';
//     m["nine"] = '9';
    
//     string temp = "";
//     for(char c : s){
//         if(int(c) > 47 && int(c) < 58){
//             answer += c;
//         } else {
//             temp += c;
//             if(m.find(temp) != m.end()){
//                 answer += m[temp];
//                 temp = "";
//             }
//         }
//     }
    
    answer = regex_replace(answer,regex("zero"),"0");
    answer = regex_replace(answer,regex("one"),"1");
    answer = regex_replace(answer,regex("two"),"2");
    answer = regex_replace(answer,regex("three"),"3");
    answer = regex_replace(answer,regex("four"),"4");
    answer = regex_replace(answer,regex("five"),"5");
    answer = regex_replace(answer,regex("six"),"6");
    answer = regex_replace(answer,regex("seven"),"7");
    answer = regex_replace(answer,regex("eight"),"8");
    answer = regex_replace(answer,regex("nine"),"9");
    
    return stoi(answer);
}