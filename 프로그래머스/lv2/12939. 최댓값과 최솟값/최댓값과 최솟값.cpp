#include <string>
#include <vector>
#include <algorithm>
#include <sstream>

using namespace std;

string solution(string s) {
    string answer = "";
    vector<int> str;
    string sbuffer;
    stringstream ss;

    ss.str(s);

    while(getline(ss, sbuffer, ' ')){
        str.push_back(stoi(sbuffer));
    }

    sort(str.begin(), str.end());
    answer = to_string(str.front()) + " " + to_string(str.back());

    return answer;
}