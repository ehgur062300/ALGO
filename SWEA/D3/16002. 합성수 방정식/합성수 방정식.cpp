#include <iostream>
#include <cmath>


using namespace std;

int main(){
    int T = 0;
    cin >> T;
    
    for(int i=1; i<=T; i++){
        int num;
        cin >> num;
        
        cout << "#" << i << " " << num*9 << " " << num*8;
    }
    
    return 0;
}
