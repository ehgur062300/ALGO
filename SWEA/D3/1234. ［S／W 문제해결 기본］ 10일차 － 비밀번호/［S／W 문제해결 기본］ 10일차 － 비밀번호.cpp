#include <iostream>

using namespace std;

int main(){
    string pw;
    
    for(int i=1; i<=10; i++){
        int len; string ori;
        cin >> len >> ori;
            
        bool flag = false;
        while(!flag){
            int start = 0;
            int end = 1;
            flag = true;
            for(int i=0; i<ori.size()-1; i++){
                if(ori[start] == ori[end]){
                    flag = false;
                    ori.erase(start,2);
                }
                else{
                    start++;
                    end++;
                }
            }
        }
        pw = ori;
        cout << "#" << i << " " << pw << "\n";
    }
    return 0;
}
