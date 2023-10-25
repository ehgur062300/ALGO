#include <iostream>

using namespace std;

int main(){
    int stones = 0;
    string winner = "";
    cin >> stones;
    
    for(int i=0; ; i++){
        if(stones >= 3){ stones -= 3; }
        else{ stones -= 1; }
        
        if(stones == 0){
            if(i%2==0){ winner = "SK"; }
            else{ winner = "CY"; }
            break;
        }
    }
    cout << winner;
    
    return 0;
}
