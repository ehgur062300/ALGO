#include <iostream>
#include <deque>

using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int t;
    cin >> t;

    deque<int> dq;
    for(int i=1; i<t+1; i++){ dq.push_back(i); }
    while(dq.size() != 1){
        dq.pop_front();
        if(dq.size()==1){ cout << dq.front(); return 0; }
        dq.push_back(dq.front());
        dq.pop_front();
    }
    cout << dq.front();
    return 0;
}