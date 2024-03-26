#include <iostream>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    
    int total = 0;
    for (int i = 0; i < 5; i++) {
        int num;
        cin >> num;
        
        total += (num*num);
    }
    cout << total%10;
    

    return 0;
}
