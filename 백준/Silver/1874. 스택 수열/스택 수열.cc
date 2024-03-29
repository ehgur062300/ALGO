#include <iostream>
#include <stack>
#include <queue>
#include <vector>

using namespace std;

int main() {
//    ios::sync_with_stdio(false);
//    cin.tie(NULL);
//    cout.tie(NULL);

    int n;
    cin >> n;

    queue<int> input, seq;
    stack<int> answer, check, result;
    vector<bool> v;

    for (int i = 1; i < n + 1; i++) {
        int num;
        cin >> num;

        input.emplace(num);
        answer.emplace(num);
        seq.emplace(i);
    }

    while(!seq.empty()){

        check.push(seq.front()); seq.pop();
        v.push_back(true);
        if(check.top() == input.front()) {
            while(!check.empty()){
                if(check.top() == input.front()){
                    result.push(check.top());
                    check.pop();
                    input.pop();
                    v.push_back(false);
                } else {
                    break;
                }
            }
        }
    }

    while(!check.empty()){
        result.push(check.top());
        check.pop();
    }

    if(result == answer){
        for(bool i : v){
            if(i){ cout << "+\n"; }
            else { cout << "-\n"; }
        }
    } else {
        cout << "NO\n";
    }

    return 0;
}
