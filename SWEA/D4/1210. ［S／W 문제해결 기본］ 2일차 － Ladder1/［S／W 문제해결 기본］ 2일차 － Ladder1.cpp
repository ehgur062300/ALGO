#include <iostream>
#include <string.h>
using namespace std;

int ladder[100][100];
bool vis[100][100];

int dir[3][2] = { {0, -1}, {0, 1}, {-1, 0} };

int goal;
int start;

void DFS(int x, int y){
    
    if(x == 0){ goal = y; return;}
    for(int j=0; j<3; j++){
        int nx = x + dir[j][0];
        int ny = y + dir[j][1];
        
        if(nx < 0 || nx >= 100 || ny < 0 || ny >= 100){ continue; }
        if(!vis[nx][ny] && ladder[nx][ny]){
            vis[nx][ny] = 1;
            DFS(nx,ny);
            return;
        }
    }
    
    
}

int main(){
    
    for(int i=0; i<10; i++){
        int tc;
        cin >> tc;
        
  		memset(vis, false, sizeof(vis));
        for(int i=0; i<100;i++){
            for(int j=0; j<100; j++){
                cin >> ladder[i][j];
                if(i==99 && ladder[i][j] == 2){ start = j; }
            }
        }
        DFS(99,start);
        
        cout << "#" << tc << " " << goal << "\n";
    }
    return 0;
}
