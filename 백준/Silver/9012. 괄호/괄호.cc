#include <iostream>
#include <stack>

using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int t;
    string vps;
    cin >> t;

    while(t-- && cin >> vps){
        stack<char> s;
        for(char &c : vps){
            if(s.empty() || s.top() == c){ s.push(c); }
            else if(s.top() == '(' && c==')'){ s.pop(); }
        }
        if(!s.empty()){ cout << "NO\n"; }
        else { cout << "YES\n"; }
    }

    return 0;
}