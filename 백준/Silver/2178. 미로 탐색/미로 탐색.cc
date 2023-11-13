#include <iostream>
#include <queue>

using namespace std;

bool maze[101][101] = {0,};
bool vis[101][101]={0,};
int road[101][101]={0,};

int dx[4] = {1,-1,0,0};
int dy[4] = {0,0,1,-1};

int main(){
    queue<pair<int,int>> q;
    
    int x,y;
    cin >> x >> y;
    
    for(int i=0; i<x; i++){
        string row;
        cin >> row;
        
        for(int j=0; j<y; j++){
            maze[i][j] = row[j]-'0';
        }
    }
    maze[0][0] = 1;
    vis[0][0] = 1;
    road[0][0]++;
    q.push({0,0});

    while(!q.empty()){
        pair<int,int> cur = q.front(); q.pop();
        
        for(int i=0; i<4; i++){
            int nx = cur.first + dx[i];
            int ny = cur.second + dy[i];
            
            if(nx<0 || nx>=x || ny<0 || ny>=y) continue;
            if(vis[nx][ny] || !maze[nx][ny]) continue;
            
            vis[nx][ny] = 1;
            road[nx][ny] = road[cur.first][cur.second]+1;
            q.push({nx, ny});
        }
    }
    
    cout << road[x-1][y-1];
    return 0;
}
