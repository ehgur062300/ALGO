#include <string>
#include <map>
#include <vector>

using namespace std;

map<string,int> m;
vector<int> mineralsList;

int stamina[3][3] = {{1,1,1},{5,1,1},{25,5,1}};
int answer = 1250;
int listSize = 0;

void dfs(vector<int> &picks, int location, int sum){
    int sumList[3] = {0,0,0};
    int save = 0;
    
    if(listSize <= location || picks[0]+picks[1]+picks[2] == 0){
        answer = min(answer,sum);
        return;
    }
    for(int i=location; i<location+5; i++){
        if(i >= listSize){
            save = i;
            break;
        }
        sumList[0] += stamina[0][mineralsList[i]];
        sumList[1] += stamina[1][mineralsList[i]];
        sumList[2] += stamina[2][mineralsList[i]];
        
        save = i;
    }
    for(int p=0; p<3; p++){
        if(picks[p]!=0){
            picks[p]-=1;
            dfs(picks,save+1,sum+sumList[p]);
            picks[p]+=1;
        }
    }
}

int solution(vector<int> picks, vector<string> minerals) {
    
    m["diamond"] = 0;
    m["iron"] = 1;
    m["stone"] = 2;
    
    listSize = minerals.size();
    
    for(string s : minerals){
        mineralsList.push_back(m[s]);
    }
    
    dfs(picks,0,0);
    
    return answer;
    
}