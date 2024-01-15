#include <string>
#include <vector>

using namespace std;

vector<int> solution(int rows, int columns, vector<vector<int>> queries) {
    vector<int> answer;
    int map[rows+1][columns+1];
    
    for(int i=1; i<=rows; i++){
        for(int j=1; j<=columns; j++){
            map[i][j] = (i-1)*columns+j;
        }
    }
    
    int min_num;
    for(vector<int> v : queries){
        int temp = map[v[0]][v[1]];
        min_num = temp;
        
        for(int i=v[0]; i<v[2]; i++){
            min_num = min(min_num, map[i][v[1]]);
            map[i][v[1]] = map[i+1][v[1]];
        }   
        for(int i=v[1]; i<v[3]; i++){
            min_num = min(min_num, map[v[2]][i]);
            map[v[2]][i] = map[v[2]][i+1];
        }  
        for(int i=v[2]; i>v[0]; i--){
            min_num = min(min_num, map[i][v[3]]);
            map[i][v[3]] = map[i-1][v[3]];
        }  
        for(int i=v[3]; i>v[1]; i--){
            min_num = min(min_num, map[v[0]][i]);
            map[v[0]][i] = map[v[0]][i-1];
        }  
        map[v[0]][v[1]+1] = temp;
        answer.push_back(min_num);
    }
    return answer;
}