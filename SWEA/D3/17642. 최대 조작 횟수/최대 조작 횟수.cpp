#include <iostream>

using namespace std;

long chk(long a, long b){
    if(a==b){ return 0; }
    else if(a>b){ return -1; }
    else if(b-a == 1){ return -1; }
    
    long diff = (a-b)*(-1);
    
    if(diff%2==1){ return (diff-1)/2; }
    else{ return diff/2; }
}

int main(){
    int T;
    cin >> T;
    
    for(int i=1; i<=T; i++){
        long a,b;
        cin >> a >> b;
        cout << "#" << i << " " << chk(a,b) << "\n";
    }
    return 0;
}
