#include <iostream>

using namespace std;

int DP[100000];

int main() {
    DP[1] = 1;
    DP[2] = 2;
    DP[3] = 4;
    
    for(int i=4; i<11; i++){
        DP[i] = DP[i-1] + DP[i-2] + DP[i-3];
    }
    
    int T;
    cin >> T;
    for(int i=0; i<T; i++){
        int num;
        cin >> num;
        cout << DP[num] << "\n";
    }
}
