#include <iostream>
#include <deque>

using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int t;
    cin>>t;

    deque<int> q;
    while(t--){
        string cmd;
        cin >> cmd;

        if(cmd=="push_front"){
            int v;
            cin >> v;
            q.push_front(v);

        } else if(cmd=="push_back"){
            int v;
            cin >> v;
            q.push_back(v);

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

        } else if(cmd=="pop_back") {
            if(q.empty()){
                cout << -1 << "\n";
            } else {
                cout << q.back() << "\n";
                q.pop_back();
            }
        } else {
            if(q.empty()){
                cout << -1 << "\n";
            } else {
                cout << q.front() << "\n";
                q.pop_front();
            }
        }
    }
    return 0;
}