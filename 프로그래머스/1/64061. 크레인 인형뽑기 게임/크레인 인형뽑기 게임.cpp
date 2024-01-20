#include <string>
#include <vector>
#include <stack>

using namespace std;

int solution(vector<vector<int>> board, vector<int> moves) {
    int answer = 0;
    int max_row = board.size();
    stack<int> s;

    for (int m : moves) {  
        if (!board[max_row - 1][m - 1]) { continue; }

        for (int i = 0; i < max_row; i++) {
            if (board[i][m - 1]) {
                int doll = board[i][m - 1];
                board[i][m - 1] = 0;

                if (s.empty()) {
                    s.push(doll);
                    break;

                }
                else if (s.top() == doll) {
                    s.pop();
                    answer += 2;
                    break;

                }
                else {
                    s.push(doll);
                    break;
                }
            }
        }
    }

    return answer;
}