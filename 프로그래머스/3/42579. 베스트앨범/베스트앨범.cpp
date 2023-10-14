#include <string>
#include <vector>
#include <algorithm>
#include <map>
#include <iostream>

using namespace std;

bool cmp(pair<string, int> & a, pair<string, int> & b){
    return a.second > b.second;
}

bool cmp_idx(pair<int, int> & a, pair<int, int> & b){
    if(a.first == b.first){ return a.second < b.second; }
    return a.first > b.first;
}

vector<int> solution(vector<string> genres, vector<int> plays) {
    vector<int> answer;
    vector<pair<string,int>> album;
    vector<pair<int,int>> best;
    map<string, int> m;
    map<string, int>::iterator it;
    
    int len = plays.size();
    
    for(int i=0; i<len; i++){ m[genres[i]] += plays[i]; }
    
    for(it=m.begin(); it!=m.end(); it++){
        album.push_back({it->first, it->second});
    }
    sort(album.begin(), album.end(), cmp);
    
    for(int i=0; i<album.size(); i++){
        for(int j=0; j<len; j++){
            if(album[i].first == genres[j]){
                best.push_back({plays[j], j});
            }
        }
        sort(best.begin(), best.end(), cmp_idx);
        
        for(int i=0; i<best.size(); i++){
            answer.push_back(best[i].second);    
            if(i == 1){ break; }
        }
        
        
        best.clear();
    }
    
    return answer;
}