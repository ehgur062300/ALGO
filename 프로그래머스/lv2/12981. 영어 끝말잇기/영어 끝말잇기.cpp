#include <string>
#include <vector>
#include <iostream>
#include <map>
using namespace std;

vector<int> solution(int n, vector<string> words) {
    int len=words.size();
    map<string,int> m;
    m[words[0]]=1;
    for(int i=1; i<len; i++){
        int len1=words[i-1].size();
        if(m[words[i]] || (words[i-1][len1-1]!=words[i][0]))
            return {i%n+1,i/n+1};
        else
            m[words[i]]=1;
    }
    return {0,0};
}
