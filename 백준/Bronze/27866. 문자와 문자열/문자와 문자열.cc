#include <iostream>

using namespace std;
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int idx;
    string str;
    
    cin >> str;
    cin >> idx;
    
    cout << str[idx-1];

    return 0;
}
