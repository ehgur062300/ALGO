#include <iostream>
#include <stack>

using namespace std;

int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(NULL);
    cout.tie(NULL);
    
    
    while(1){
        deque<char> dq;
        string str;
        cin >> str;
        
        if(str=="0"){break;}
        for(char c:str){
            dq.push_back(c);
        }
        
        while(dq.size() > 1){
            
            if(dq.front()==dq.back()){
                dq.pop_back();
                dq.pop_front();
                
            } else {
                cout << "no\n";
                break;
            }
        }
        if(dq.size()<2)
            cout << "yes\n";
        
    }
    return 0;
}
