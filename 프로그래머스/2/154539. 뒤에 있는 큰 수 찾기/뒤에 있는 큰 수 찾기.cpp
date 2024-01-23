#include <string>
#include <vector>
#include <stack>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> numbers) {
    vector<int> answer;
    stack<int> s;

    for(int n=numbers.size()-1; n>=0; n--){
        if(s.empty()){
            s.push(numbers[n]);
            answer.push_back(-1);
            continue;
        }
        while(!s.empty()){
            if(s.top() <= numbers[n]){
                s.pop();
            }else{
                answer.push_back(s.top());
                s.push(numbers[n]);
                break;
            }
        }
        if(s.empty()){
            s.push(numbers[n]);
            answer.push_back(-1);
        }    
    }

    reverse(answer.begin(),answer.end());
    
    return answer;
}