#include <string>
#include <vector>
#include <algorithm>
#include <sstream>

using namespace std;


vector<string> split(string s, char dlim){
    vector<string> str;
    string sbuffer;
    stringstream ss;

    ss.str(s);

    while(getline(ss,sbuffer, dlim)){
        str.push_back(sbuffer);
    }
    return str;
}

bool cmp(string a, string b)
{
    return stoi(a) < stoi(b); // 1 2 3 4 5 6 7 8 9 10   뒤에있는 숫자가 더 크다.
}

string solution(string s) {
    string answer = "";

    vector<string> re = split(s,' ');

    sort(re.begin(), re.end(), cmp);
    answer.append(*re.begin());
    answer.append(" ");
    answer.append(re.back());

    return answer;
}