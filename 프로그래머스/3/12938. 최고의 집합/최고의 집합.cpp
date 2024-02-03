#include <string>
#include <vector>

using namespace std;

vector<int> solution(int n, int s) {
    vector<int> answer;
    
    int num = s;
    if(num < n){
        return {-1};
    }
    for(int i=n; i>1; i--){
        if(num/i != 0){
            answer.push_back(num/i);
            num -= num/i;
        }
    }
    answer.push_back(num);
    return answer;
}