#include <iostream>

using namespace std;
int main() {
    int n,t=0;
    while(cin>>n) { t += (n*n); }
    cout << t%10;
    
    return 0;
}
