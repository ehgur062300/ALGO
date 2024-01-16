#include <string>
#include <vector>
#include <map>

using namespace std;

vector<int> solution(vector<int> lottos, vector<int> win_nums) {
    vector<int> answer;
    map<int,int> m;
    int t = 0;
    int zero = 0;
    
    for(int n : win_nums){
        m[n] = 1;
    }
    for(int l : lottos){
        if(!l){zero++;}
        else if(m.find(l) != m.end()){
            t++;
        }
    }
    if(!t){
        if(!zero){
            return {6,6};
        }
        return {7-zero,zero};
    }
    answer.push_back(7-zero-t);
    answer.push_back(7-t);
    
    return answer;
}