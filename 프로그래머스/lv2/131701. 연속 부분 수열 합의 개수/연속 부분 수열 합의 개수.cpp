#include <string>
#include <vector>
#include <set>

using namespace std;

int solution(vector<int> elements) {
    set<int> sums;

    int len = elements.size();
    for (int i = 0; i < len; i++) {
        int sum = 0;
        for (int j = 0; j < len; j++) {
            sum += elements[(i+j) % len];
            sums.insert(sum);
        }
    }
    return sums.size();
}