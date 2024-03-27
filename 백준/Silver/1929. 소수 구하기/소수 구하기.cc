#include <iostream>
#include <vector>
#include <cmath>

using namespace std;

int main() {

    int m,n;
    cin >> m >> n;

    vector<bool> v(n+1,true);
    v[0] = false;
    for(int i=m; i<=n; i++){
        if(v[i-1]){
            bool io = true;
            for(int a=2; a<=sqrt(i); a++){

                // 소수가 아닐 때
                if(i!=a && i%a == 0){
                    io = false;
                    for(long long int h=i; h<n; h*=i){ v[h-1] = false; }
                    break;
                }
            }
            if(io) { cout << i << "\n"; }
        }
    }

    return 0;
}
