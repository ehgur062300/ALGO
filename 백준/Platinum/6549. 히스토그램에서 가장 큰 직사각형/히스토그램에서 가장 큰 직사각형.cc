#include <iostream>
#include <stack>

using namespace std;

long long h[100001];

int main(){
    cin.tie(NULL);
    cout.tie(NULL);
    ios::sync_with_stdio(false);
    
    while(1){
        stack<int> s;
        int n;
        long long max = -1;
        cin >> n;
        
        if(!n){break;}
        
        for(int i=0; i<n; i++){
            cin >> h[i];
        }
        for(int i=0; i<n; i++){
            while(!s.empty() && h[i] < h[s.top()]){
                long long h_top = h[s.top()];
                int l = i;
                s.pop();
                
                if(!s.empty()){
                    l = i - s.top() - 1;
                }
                if(max < l*h_top){
                    max = l * h_top;
                }
            }
            s.push(i);
        }
        
        while(!s.empty()){
            long long h_top = h[s.top()];
            int l = n;
            s.pop();
            
            if(!s.empty()){
                l = n - s.top() - 1;
            }
            if(max < l * h_top){
                max = l * h_top;
            }
        }
        
        cout << max << "\n";
    }
}