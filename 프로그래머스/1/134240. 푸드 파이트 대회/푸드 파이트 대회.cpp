#include <string>
#include <vector>

using namespace std;

string solution(vector<int> food) {
    string answer = "";
    
    for(int i=1; i<food.size(); i++){
        int cnt=food[i];
        
        if(!cnt){ 
            continue;
            
        }else if(cnt % 2 != 0){
            cnt--;
            
        }
        for(int j=0; j<cnt/2; j++){
            answer += to_string(i);
        }
    }
    string temp;
    for(int i=answer.length()-1; i>=0; i--){
        temp += answer[i];
    }
    answer += ("0" + temp);
    
    return answer;
}