#include<vector>
#include<queue>
#include<iostream>
using namespace std;

int vis[101][101];
int dx[4] = {1,-1,0,0};
int dy[4] = {0,0,1,-1};

int solution(vector<vector<int>> maps){
    int answer = -1;
    queue<pair<int,int>> q;
    int x = maps.size()-1;
    int y = maps[0].size()-1;
    
    for(int i=0; i<x; i++){
        for(int j=0; j<y; j++){
            vis[i][j] = 0;
        }
    }
    
    vis[0][0] = 1;
    q.push({0,0});
    
    while(!q.empty()){
        pair<int,int> cur = q.front(); q.pop();
        if(cur.first == maps.size()-1 && cur.second == maps[0].size()-1){
            answer = vis[cur.first][cur.second];
            return answer;
        }
    
        for(int dir=0; dir<4; dir++){
            int nx = cur.first + dx[dir];
            int ny = cur.second + dy[dir];
            
            if(nx<0 || nx>x || ny<0 || ny>y) continue;
            if(vis[nx][ny]==0 && maps[nx][ny]){
                vis[nx][ny] = vis[cur.first][cur.second]+1;
                q.push({nx,ny});
            }
        }
    }
    return answer;
}