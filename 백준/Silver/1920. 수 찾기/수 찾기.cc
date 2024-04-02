#include <iostream>
#include <set>

using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int N,num;
    cin >> N;

    set<int> s;
    while(N-- && cin >> num){ s.emplace(num); }

    cin >> N;
    while(N-- && cin >> num){
        if(s.find(num) == s.end()){
            cout << 0 << "\n";
        } else {
            cout << 1 << "\n";
        }
    }

    return 0;
}