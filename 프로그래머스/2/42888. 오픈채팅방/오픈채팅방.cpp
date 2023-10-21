#include <string>
#include <vector>
#include <sstream>
#include <unordered_map>

using namespace std;

vector<string> solution(vector<string> record) {
    vector<string> answer;
	unordered_map<string, string> m;
	vector<pair<string,string>> result;

	for (auto &r : record) {
		string first, second, third;
		stringstream sstream;
		sstream.str(r);
		sstream >> first >> second >> third;
		
		if (first == "Enter") {
			m[second] = third;
			result.push_back({second, "들어왔습니다."});

		}
		else if(first == "Leave")
			result.push_back({second, "나갔습니다."});
		else if(first =="Change")
			m[second] = third;
	}
	for (int i = 0; i < result.size();i++) {
		answer.push_back(m[result[i].first] + "님이 " + result[i].second);
	}
	return answer;
}