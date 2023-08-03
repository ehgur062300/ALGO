#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string numbers = "0123456789ABCDEF";

string program(int num, int base){
    string trans = "";
    
    while(num){
        trans += numbers[num%base];
        num /= base;
    }
    reverse(trans.begin(), trans.end());
    
    return trans;
}

string solution(int n, int t, int m, int p) {
    string answer = "";
    string total = "0";
    
    for(int i=1; total.size()<t*m; i++){
        total += program(i,n);
    }
    
    for(int j=p-1; j<t*m; j += m){
        answer += total[j];
    }
    
    return answer;
}