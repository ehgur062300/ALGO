#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool cmp(int a, int b){
    string str_a = to_string(a);
    string str_b = to_string(b);
    
    if(str_a + str_b > str_b + str_a){
        return true;
    }
    return false;
}

string solution(vector<int> numbers) {
    string answer = "";

    sort(numbers.begin(), numbers.end(), cmp);
    for(int i=0; i<numbers.size(); i++){
        answer += to_string(numbers[i]);
    }
    if(answer[0] == '0'){ return "0"; }
    
    return answer;
}