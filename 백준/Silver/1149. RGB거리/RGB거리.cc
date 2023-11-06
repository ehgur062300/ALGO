#include <iostream>
#include <cmath>

using namespace std;

int DP[1001][3];
int arr[3];
int main() {
    DP[0][0] = 0;
    DP[0][1] = 0;
    DP[0][2] = 0;
    
    int n;
    cin >> n;
    for(int i=1; i<=n; i++){
        cin >> arr[0] >> arr[1] >> arr[2];
        DP[i][0] = min(DP[i-1][1], DP[i-1][2]) + arr[0];
        DP[i][1] = min(DP[i-1][0], DP[i-1][2]) + arr[1];
        DP[i][2] = min(DP[i-1][1], DP[i-1][0]) + arr[2];
    }
    
    cout << min(DP[n][0], min(DP[n][1], DP[n][2]));
   
    return 0;
}
