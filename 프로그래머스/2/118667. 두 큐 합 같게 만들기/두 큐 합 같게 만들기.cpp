#include <string>
#include <vector>

using namespace std;

int solution(vector<int> queue1, vector<int> queue2) {
    vector<int> v;
    int answer = 0;
    int size = queue1.size()*2;
    int s1 = queue1.size();
    int s2 = 0;
    int e1 = queue1.size()-1;
    int e2 = queue1.size()*2-1;
        
    long long int sum1 = 0, sum2 = 0;
    
    for(int n1 : queue1){
        sum1 += n1;
        v.push_back(n1);
    }
    for(int n2 : queue2){
        sum2 += n2;
        v.push_back(n2);
    }
    
    while(answer <= size*2){
        if(sum1 < sum2){
            sum1 += v[(++e1) % size];
            sum2 -= v[(s1++) % size];
        }else if(sum1 > sum2){
            sum1 -= v[(s2++) % size];
            sum2 += v[(++e2) % size];
        }else{
            return answer;
        }
        answer++;
    }
    return -1;
}