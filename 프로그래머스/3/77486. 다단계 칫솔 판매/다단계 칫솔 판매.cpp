#include <string>
#include <vector>
#include <unordered_map>

using namespace std;

vector<int> solution(vector<string> enroll, vector<string> referral, vector<string> seller, vector<int> amount) {
    unordered_map<string,string> com;
    unordered_map<string,int> sel;
    vector<int> answer;
    
    for(int i=0; i<enroll.size(); i++){
        com[enroll[i]] = referral[i];
        sel[enroll[i]] = 0;
    }
    
    for(int i=0; i<seller.size(); i++){
        string cur = seller[i];
        string nex = com[cur];
        
        int cache = amount[i]*100;
        
        while(cur != "-"){
            int charge = cache*0.1;
            sel[cur] += (cache-charge);
            if(charge==0){break;}
            cache = charge;
            
        
            cur = nex;
            nex = com[cur];
        }
    }

    for(string s : enroll){
        answer.push_back(sel[s]);
    }
    
    return answer;
}