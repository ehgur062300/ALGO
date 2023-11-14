#include <iostream>
#include <numeric>

using namespace std;

int gcd(int a, int b){
    while(b!=0){
        int r = a%b;
        a= b;
        b= r;
    }
    return a;
}

int lcm(int a, int b){
    return a * b / gcd(a,b);
}

int main(){
    int T = 0;
    cin >> T;
    
    for(int i=1; i<=T; i++){
        string result = "yes";
        string num1, num2;
        cin >> num1 >> num2;
        
        if(num1 == num2){
            cout << "#" << i << " " << result << "\n";
            continue;
        }
        
        int len = lcm((int)num1.size(), (int)num2.size());
        
        int idx = 0;
        while(num1.size() < len){ num1 += num1[idx]; idx++; }
        
        idx = 0;
        while(num2.size() < len){ num2 += num2[idx]; idx++; }
        if(num1 != num2){ result = "no"; }
        cout << "#" << i << " " << result << "\n";
        len = 0;
    }
    
    return 0;
}
