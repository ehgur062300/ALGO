#include <iostream>
#include <unordered_map>

using namespace std;

unordered_map<long long int,long long int> A;
long long int n,p,q;

long long int DP(long long int n){
    if(A[n]){ return A[n]; }
    A[n] = DP(n/p)+DP(n/q);
    
    return A[n];
}

int main(){
    
    A[0] = 1;
    A[1] = 2;

    cin >> n >> p >> q;
    if(n==0 || n==1){ cout << A[n]; return 0; }
    cout << DP(n);
    
    return 0;
}
