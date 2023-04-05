#include <string>
#include <queue>
#include <vector>

using namespace std;

int solution(vector<int> priorities, int location) {
    int answer = 0;
    queue<pair<int,int>> q;
    priority_queue<int> pq;
    
    for(int i=0; i<priorities.size(); i++){
        q.push({i,priorities[i]});
        pq.push(priorities[i]);
    }
    
    while(!q.empty()){
        int i = q.front().first;
        int p = q.front().second;
        q.pop();
        
        if(p == pq.top()){
            answer += 1;
            pq.pop();
            
            if(i == location){ break; }
        }
        
        else{
            q.push({i,p});
        }
    }
    return answer;
}