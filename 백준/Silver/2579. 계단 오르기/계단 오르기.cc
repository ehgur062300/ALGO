#include <iostream>
#include <cmath>

using namespace std;

int DP[301];
int arr[301];
int main() {
    int n;
    cin >> n;
    for(int i=1; i<=n; i++){
        int num;
        cin >> arr[i];
    }
    DP[1] = arr[1];
    DP[2] = arr[1] + arr[2];
    DP[3] = max(arr[1]+arr[3], arr[2]+arr[3]);
    
    for(int i=4; i<=n; i++){
        DP[i] = max(DP[i-2]+arr[i], DP[i-3]+arr[i-1]+arr[i]);
    }
    
    cout << DP[n];
}
