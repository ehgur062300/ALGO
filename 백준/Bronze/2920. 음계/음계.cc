#include <iostream>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    string asc = "12345678";
    string des = "87654321";
    string chk,c;

    while(cin >> c){
        chk += c;
    }

    if(chk == asc){ cout << "ascending"; }
    else if(chk == des){ cout << "descending"; }
    else { cout << "mixed"; }

    return 0;
}
