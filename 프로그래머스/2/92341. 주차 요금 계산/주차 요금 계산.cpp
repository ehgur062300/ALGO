#include <string>
#include <vector>
#include <map>
#include <cmath>

using namespace std;

vector<int> solution(vector<int> fees, vector<string> records) {
    vector<int> answer;
    map<string, vector<int>> m;
    
    string io = "";
    string car_num = "";
    int time = 0;
    for(auto &record : records){
        io = record.substr(11,2);
        car_num = record.substr(6,4);
        time = stoi(record.substr(0,2))*60 + stoi(record.substr(3,2));
        
        m[car_num].push_back(time);
    }
    
    for(auto &it: m) {
        if(it.second.size() % 2 != 0){ it.second.push_back(23*60+59); }
        
        vector<int> info = it.second;
        int total = 0;
        for(int i=1; i<info.size(); i+=2) {
            total += (info[i]-info[i-1]);
        }
        
        int price = fees[1];
        if(total > fees[0]) {
            price += ceil((total-fees[0]) / (double)fees[2]) * fees[3];
        }
        
        answer.push_back(price);
    }
    
    return answer;
}