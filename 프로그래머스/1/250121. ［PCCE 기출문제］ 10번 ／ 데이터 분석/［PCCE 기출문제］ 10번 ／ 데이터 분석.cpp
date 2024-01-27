#include <string>
#include <vector>
#include <map>
#include <algorithm>

using namespace std;

vector<vector<int>> solution(vector<vector<int>> data, string ext, int val_ext, string sort_by) {
    vector<vector<int>> answer;
    map<string,int> m;
    vector<pair<int,int>> v;
    
    for(int i=0; i<data.size(); i++){
        m["code"] = data[i][0];
        m["date"] = data[i][1];
        m["maximum"] = data[i][2];
        m["remain"] = data[i][3];
        
        if(m[ext] < val_ext){
            v.push_back({m[sort_by],i});
        }
    }
    
    sort(v.begin(),v.end());
    for(auto d : v){
        answer.push_back(data[d.second]);
    }
    
    return answer;
}