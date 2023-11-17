#include <iostream>
#include <map>

using namespace std;

int DP[100000];
int arr[100000];

int main(){
    cin.tie(NULL);
    ios::sync_with_stdio(false);
    
    int n,m;
    cin >> n >> m;
    for(int i=0; i<n; i++){
        cin >> arr[i];
    }
    DP[0] = arr[0];
    
    for(int i=1; i<n; i++){
        DP[i] = DP[i-1] + arr[i];
    }
    
    for(int i=0; i<m; i++){
        int s,e;
        int result;
        cin >> s >> e;
        
        if(s == e){ cout << arr[s-1] << "\n"; continue;}
        else if(s == 1){ cout << DP[e-1] << "\n"; continue;}
        else { cout << DP[e-1]-DP[s-2] << "\n"; continue;}
    }
    
    
    return 0;
}
