#include <iostream>
#include <cmath>
#include <set>

using namespace std;

int main(){

    while(true){
        set<int> s;
        for(int i=0; i<3; i++){
            int n;
            cin >> n;

            if(!n){ return 0; }
            s.emplace(n);
        }
        
        int t=0;
        bool io = true;
        for(auto &v : s){
            if(v == sqrt(t)){
                io= false;
                cout << "right\n";
                break;
            }
            t += (v*v);
        }
        if(io){ cout << "wrong\n"; }
    }
    return 0;
}