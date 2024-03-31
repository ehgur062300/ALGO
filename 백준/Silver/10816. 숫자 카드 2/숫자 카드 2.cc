#include <iostream>
#include <map>

using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    map<string,int> m;

    int N;
    string num;
    cin >> N;

    while(N--){
        cin >> num;
        m[num]++;
    }

    cin >> N;
    while(N--){
        cin >> num;
        if(m.find(num) != m.end()){
            cout << m[num] << " ";
        } else {
            cout << 0 << " ";
        }
    }
    return 0;
}