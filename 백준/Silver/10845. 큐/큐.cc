#include <iostream>
#include <cmath>
#include <queue>

using namespace std;

int main(){
//    ios::sync_with_stdio(false);
//    cin.tie(NULL);
//    cout.tie(NULL);

    int t;
    cin>>t;

    queue<int> q;
    while(t--){
        string cmd;
        cin >> cmd;

        if(cmd=="push"){
            int v;
            cin >> v;
            q.push(v);

        } else if(cmd=="back"){
            if(q.empty()){
                cout << -1 << "\n";
            } else {
                cout << q.back() << "\n";
            }

        } else if(cmd=="front"){
            if(q.empty()){
                cout << -1 << "\n";
            } else {
                cout << q.front() << "\n";
            }

        } else if(cmd=="size"){
            cout << q.size() << "\n";

        } else if(cmd=="empty"){
            cout << int(q.empty()) << "\n";

        } else {
            if(q.empty()){
                cout << -1 << "\n";
            } else {
                cout << q.front() << "\n";
                q.pop();
            }
        }
    }
    return 0;
}