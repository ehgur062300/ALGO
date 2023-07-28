#include <string>
#include <vector>
#include <algorithm>
#include <math.h>

using namespace std;

bool isPrime(long long n) {
    if(n < 2){ return false; }
	for (long long i = 2; i <= sqrt(n); i++) {
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
        return 0;
    }
    
    string temp = "0";
    for(int i=0; i<v.size(); i++){
        if(v[i] == 0){
            if(isPrime(stoll(temp))){ answer++; }
            temp = "0";
        }
        else {
            temp += to_string(v[i]);

            if(i+1 == v.size()){
                if(isPrime(stoll(temp))){ answer++; }
            }
        }
    }
    return answer;
}