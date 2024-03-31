#include <iostream>
#include <cmath>
#include <stack>

using namespace std;

int main(){
//    ios::sync_with_stdio(false);
//    cin.tie(NULL);
//    cout.tie(NULL);

    int t;
    cin>>t;

    stack<int> s;
    while(t--){
        string cmd;
        cin >> cmd;

        if(cmd=="push"){
            int v;
            cin >> v;
            s.push(v);

        } else if(cmd=="top"){
            if(s.empty()){
                cout << -1 << "\n";
            } else {
                cout << s.top() << "\n";
            }

        } else if(cmd=="size"){
            cout << s.size() << "\n";

        } else if(cmd=="empty"){
            cout << int(s.empty()) << "\n";

        } else {
            if(s.empty()){
                cout << -1 << "\n";
            } else {
                cout << s.top() << "\n";
                s.pop();
            }
        }
    }
    return 0;
}