#include <string>
#include <vector>

using namespace std;
int answer = 0;

void DFS(vector<int> numbers, int target, int sum, int cnt){
    int level = numbers.size();
    if(cnt == level){
        if(sum == target){ answer++; }
        return;
    }
    
    DFS(numbers, target, sum+numbers[cnt], cnt+1);
    DFS(numbers, target, sum-numbers[cnt], cnt+1);
}
int solution(vector<int> numbers, int target) {
    DFS(numbers, target, 0, 0);
    return answer;
}