#include <string>
#include <vector>
#include <unordered_set>

using namespace std;

int run_time = 0;
int miss = 5;
int hit = 1;
vector<string> recentlyUsed;
unordered_set<string> cache;

void toLower(vector<string> &cities){
    for(int i=0; i<cities.size(); i++){
        for(int j=0; j<cities[i].size(); j++){
            if(cities[i][j] >= 'A' && cities[i][j] <= 'Z'){
                cities[i][j] += 32;
            }
        }
    }
}

int solution(int cacheSize, vector<string> cities) {
    
    if(cacheSize == 0){ return miss*cities.size(); }
    
    toLower(cities);
    
    for(auto &city : cities){
        if(cache.find(city) == cache.end()){
            run_time += miss;
            if(recentlyUsed.size() == cacheSize){
                if(cacheSize != 0){
                    cache.erase(recentlyUsed[0]);
                    recentlyUsed.erase(recentlyUsed.begin());
                }
            }
            cache.insert(city);
            recentlyUsed.push_back(city);
        }
        else{
            run_time += hit;
            int i;
            for(i=0; i<recentlyUsed.size(); i++){
                if(recentlyUsed[i] == city){break;}
            }
        
            recentlyUsed.erase(recentlyUsed.begin()+i);
            recentlyUsed.push_back(city);
        }
    }
    return run_time;
}