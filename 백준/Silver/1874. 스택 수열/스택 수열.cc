#include <iostream>
#include <stack>
#include <vector>

using namespace std;

int main() {
//    ios::sync_with_stdio(false);
//    cin.tie(NULL);
//    cout.tie(NULL);

    int n, s=0;
    cin >> n;

    stack<int> input;
    vector<bool> v;

    for (int i = 0; i < n; i++) {
        int num;
        cin >> num;

        while(s<num){
            input.emplace(++s);
            v.push_back(true);
        }
        if(input.top() == num){
            input.pop();
            v.push_back(false);
        }
        else {
            cout << "NO";
            return 0;
        }
    }

    for(bool i : v){
        if(i){ cout << "+\n"; }
        else { cout << "-\n"; }
    }

    return 0;
}
