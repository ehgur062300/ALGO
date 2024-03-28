#include <iostream>
#include <map>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int t;
    cin >> t;
    for(int i=0; i<t; i++){
        map<string,int> m;

        int cnt, total=1;
        cin >> cnt;
        
        if(!cnt){
            cout<<0<<"\n";
            continue;
        }
        for(int j=0; j<cnt; j++){
            string str1, str2;
            cin >> str1;
            cin >> str2;
            m[str2]++;
        }

        for(auto & v : m) {
            total *= (v.second+1);
        }
        cout << --total << "\n";
    }

    return 0;
}