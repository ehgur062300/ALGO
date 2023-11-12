#include <iostream>
#include <queue>

using namespace std;

bool board[502][502];
bool vis[502][502] = {0,};

int dx[4] = {1, 0, -1, 0};
int dy[4] = {0, 1, 0, -1};

int main(){
    queue<pair<int,int>> q;
    
    int x,y;
    cin >> x >> y;
    
    for(int i=0; i<x; i++){
        for(int j=0; j<y; j++){
            cin >> board[i][j];
        }
    }
    
    int draw_cnt = 0;
    int max = 0;
    for(int i=0; i<x; i++){
        for(int j=0; j<y; j++){
            if(board[i][j] && !vis[i][j]){
                int bred = 1;
                vis[i][j] = 1;
                q.push({i,j});
                
                draw_cnt++;
                while(!q.empty()){
                    pair<int, int> cur = q.front(); q.pop();
                    for(int dir=0; dir<4; dir++){
                        int nx = cur.first + dx[dir];
                        int ny = cur.second + dy[dir];
                        
                        if(nx < 0 || nx >= x || ny < 0 || ny >= y) continue;
                        if(vis[nx][ny] || !board[nx][ny]) continue;
                        
                        vis[nx][ny] = 1;
                        q.push({nx,ny});
                        bred++;
                    }
                }
                if(max < bred){ max = bred; }
            }
        }
    }
    cout << draw_cnt << "\n";
    cout << max << "\n";
    
    return 0;
}
