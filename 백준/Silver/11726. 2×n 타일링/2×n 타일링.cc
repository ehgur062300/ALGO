#include <iostream>

using namespace std;

int DP[1001];
int main(){
    DP[1] = 1;
    DP[2] = 2;
    DP[3] = 3;
    
    for(int i=4; i<=1000; i++){
        DP[i] = (DP[i-1] + DP[i-2])%10007;
    }
    
    int n;
    cin >> n;
    
    cout << DP[n];
    return 0;
}
