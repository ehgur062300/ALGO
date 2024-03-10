#include <string>
#include <vector>

using namespace std;

int find_idx(char c, vector <pair<char, int>> v)// 인덱스 찾아주기
{
    for(int i=0;i<v.size();i++)
        if(v[i].first == c) return i;
    return -1;
}

string solution(vector<string> survey, vector<int> choices)
{
    string answer = "", type = "RTCFJMAN";
    vector <pair<char, int>> v;
    for(int i=0;i<type.size();i++) v.push_back(make_pair(type[i],0));
    for(int i=0;i<survey.size();i++)// 선택지 선택에 따른 점수 계산
    {
        if(choices[i] < 4)
            v[find_idx(survey[i][0], v)].second += 4 - choices[i];
        else if(choices[i] > 4)
            v[find_idx(survey[i][1], v)].second += choices[i] - 4;
    }
    for(int i=0;i<4;i++)
    {
        if(v[i*2].second > v[i*2+1].second) answer.push_back(v[i*2].first);//점수 큰 유형을 answer에 push_back해준다.
        else if(v[i*2].second < v[i*2+1].second) answer.push_back(v[i*2+1].first);
        else answer.push_back(v[i*2].first);// 동일하다면 사전순
    }
    return answer;
}