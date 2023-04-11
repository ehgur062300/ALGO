#include <string>
#include <vector>
#include <queue>

using namespace std;

int solution(int bridge_length, int weight, vector<int> truck_weights) {
    queue <int> q;
    int answer = 0;
    int bridgeOn=0;
    int i=0;
    
    while(1){
        answer++;
        
        if(q.size()==bridge_length){
            bridgeOn-=q.front();
            q.pop();
        }
        if(bridgeOn+truck_weights[i]<=weight){
            
            if(i==truck_weights.size()-1){
                answer+=bridge_length;
                break;
            }
            q.push(truck_weights[i]);
            bridgeOn+=truck_weights[i];
            i++;
        }
        else{
            q.push(0);
        }
    }
    return answer;
}