#include <iostream>

using namespace std;

pair<int,int> DP[41];

int main(){
    int T;
    cin >> T;
    for(int test_case=0; test_case<T; test_case++){
        int num = 0;
        DP[0] = {1,0};
        DP[1] = {0,1};
        
        cin>>num;

        if(num == 0){ 
            cout << "1 0\n";
            continue;
        }
        else if(num == 1){
            cout << "0 1\n";
            continue;
        }
        
        for(int i=2; i<41; i++){
            DP[i].first = DP[i-1].first + DP[i-2].first;
            DP[i].second = DP[i-1].second + DP[i-2].second;
        }
        
        cout << DP[num].first << " " << DP[num].second << "\n";
    }
    
    return 0;
}

