#include <iostream>

using namespace std;

int arr[2001];
bool DP[2001][2001] = {0,};

int main() {
    cin.tie(NULL); cout.tie(NULL); ios_base::sync_with_stdio(false);
    
    int len;
    cin >> len;
    
    for(int i=1; i<=len; i++){ cin >> arr[i]; }
    
    for(int i=1; i<len; i++){
        if(arr[i]==arr[i+1]){
            DP[i][i+1] = 1;
        }
    }
    
    for(int i=1; i<=len; i++){
        DP[i][i] = 1;
    }
    
    for(int i=len-1; i>=1; i--){
        for(int j=i+2; j<=len; j++){
            if(arr[i]==arr[j] && DP[i+1][j-1]==1){
                DP[i][j] = 1;
            }
        }
    }
    
    int question;
    cin >> question;
    
    for(int i=0; i<question; i++){
        int s,e;
        cin >> s >> e;
        cout << DP[s][e] << "\n";
    }
    
    return 0;
}
