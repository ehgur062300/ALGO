#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<int>> sizes) {
    int answer = 0, max_c=0, max_r=0;
    for(int i=0; i<sizes.size(); i++){
        int c = 0, r = 0;
        for(int j=1; j<2; j++){
            if(sizes[i][j-1] < sizes[i][j]){
                c = sizes[i][j];
                r = sizes[i][j-1];
            }else{
                c = sizes[i][j-1];
                r = sizes[i][j];
            }
            if(max_c < c){max_c = c;}
            if(max_r < r){max_r = r;}
        }
    }
    answer = max_c * max_r;
    return answer;
}