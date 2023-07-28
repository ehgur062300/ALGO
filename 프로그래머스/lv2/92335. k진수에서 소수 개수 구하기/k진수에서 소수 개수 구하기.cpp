#include <string>
#include <vector>
#include <algorithm>
#include <math.h>

using namespace std;

bool isPrime(long long n) {
    if(n == 1){ return false; }
	for (int i = 2; i <= sqrt(n); i++) {
		if (n%i == 0) { return false; }
	}
	return true;
}

int solution(int n, int k) {
    int answer = 0;
    vector<int> v;
    
    while(n){
        v.push_back(n%k);
        n /= k;
    }
    reverse(v.begin(), v.end());
    
    if(v.size() == 1){
        if(isPrime(v[0])){ return 1; }
    }
    
    string temp = "";
    if(v[0] != 0){ temp += to_string(v[0]); }
    for(int i=1; i<v.size(); i++){
        if(v[i] == 0 && v[i-1] == 0){ continue; }
        else if(v[i] == 0 && v[i-1] != 0){
            if(isPrime(stol(temp))){ answer++; }
            temp = "";
            continue;
        }
        temp += to_string(v[i]);
        
        if(i+1 == v.size()){
            if(isPrime(stol(temp))){ answer++; }
        }
    }
    return answer;
}