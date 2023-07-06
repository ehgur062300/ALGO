#include <string>
#include <vector>
#include <unordered_set>

using namespace std;

int totalTime = 0;
const int miss = 5;
const int hit = 1;
vector<string> recentlyUsed;
unordered_set<string> cached;

using namespace std;

void toLowercase (vector<string> &cities) {
    for (int i = 0; i < cities.size(); i++) {
        for (int j = 0; j < cities[i].size(); j++) {
            if ('A' <= cities[i][j] && cities[i][j] <= 'Z') {
                cities[i][j] += 32;
            }
        }
    }
}

int solution(int cacheSize, vector<string> cities) {
    
    if (cacheSize == 0) return (5* cities.size());
    
    toLowercase(cities);
    
    for (auto &city : cities) {
        
        if (cached.find(city) == cached.end()) {
            totalTime += miss;
            if (recentlyUsed.size() == cacheSize) {
                if (cacheSize != 0) {
                    cached.erase(recentlyUsed[0]);
                    recentlyUsed.erase(recentlyUsed.begin());
                }
            }
            cached.insert(city);
            recentlyUsed.push_back(city);
        }
        else {
            totalTime += hit;
            int i = 0;
            for (i; i < recentlyUsed.size(); i++) {
                if (recentlyUsed[i] == city) {
                    break;
                }
            }
            recentlyUsed.erase(recentlyUsed.begin() + i);
            recentlyUsed.push_back(city);
        }
    }
    
    return totalTime;
}