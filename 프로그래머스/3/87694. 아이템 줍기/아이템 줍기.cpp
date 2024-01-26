#include <string>
#include <vector>
#include <queue>

#include <iostream>

using namespace std;

bool map[102][102];
bool vis[102][102];

queue<pair<int,int>> q;

int dx[4] = {1,-1,0,0};
int dy[4] = {0,0,1,-1};

void init(vector<vector<int>> &rectangle){
    for (auto & rect : rectangle) {
        for (int i=0; i<4; i++){
            rect[i] = rect[i]*2;
        }
        int x1 = rect[0];
        int y1 = rect[1];
        int x2 = rect[2];
        int y2 = rect[3];
        
        for (int x=x1;x<=x2;x++){
            for (int y=y1;y<=y2;y++){
                map[x][y] = 1;
            }
        }
    }
    for (auto & rect : rectangle)
    {        
        int x1 = rect[0];
        int y1 = rect[1];
        int x2 = rect[2];
        int y2 = rect[3];
        for (int x=x1+1;x<x2;x++){
            for (int y=y1+1;y<y2;y++){
                map[x][y] = 0;
            }
        }
    }
}

int solution(vector<vector<int>> rectangle, int characterX, int characterY, int itemX, int itemY) {
    int cnt = 1;
    int answer = 0;
    
    init(rectangle);
    
    q.push({characterX*2,characterY*2});
    vis[characterX*2][characterY*2] = 1;
    
    while(!q.empty()){
        pair<int,int> cur = q.front(); q.pop();
        
        if(cur.first == itemX*2 && cur.second == itemY*2){
            answer = (cnt/4);
            break;
        }
        
        for(int dir=0; dir<4; dir++){
            int nx = cur.first + dx[dir];
            int ny = cur.second + dy[dir];
            
            if(map[nx][ny] && !vis[nx][ny]){
                q.push({nx,ny});
                vis[nx][ny] = 1;
                cnt++;
            }   
        }
    }
    
    return answer;
}