#include <string>
#include <vector>
#include <deque>

using namespace std;

string solution(vector<int> food) {
    string answer = "";
    deque<int> dq;
    deque<int>::iterator it;
    
    for(int i=1; i<food.size(); i++){
        int cnt=food[i];
        
        if(!cnt){ 
            continue;
            
        }else if(cnt % 2 != 0){
            cnt--;
            
        }
        for(int j=0; j<cnt/2; j++){
            dq.push_back(i);
        }
    }
    
    for(it=dq.begin(); it != dq.end(); it++){
        answer += to_string(*it);
    }
    answer += "0";
    for(it=dq.end()-1; it >= dq.begin(); it--){
        answer += to_string(*it);
    }
    
    
    
    return answer;
}