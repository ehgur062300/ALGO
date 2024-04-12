import java.util.*;

class Solution {
    class Cur {
        int x;
        int y;

        public Cur(int x,int y){
            this.x = x;
            this.y = y;
        }
    }   
    public int solution(int[][] maps) {
        int n = maps.length-1;
        int m = maps[0].length-1;
        int answer = 0;
        int[][] vis = new int[n+1][m+1];
        
        bfs(maps,vis,n,m);
        answer = vis[n][m];
        
        if(answer == 0){
            return -1;
        }
        
        return answer;
    }
    
    private void bfs(int[][] maps, int[][] vis, int n, int m){
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        
        Queue<Cur> q = new LinkedList<>();
        q.add(new Cur(0,0));
        vis[0][0] = 1; 
        
        while(!q.isEmpty()){
            Cur cur = q.poll();

            for(int i=0; i<4; i++){
                int nx = dx[i] + cur.x;
                int ny = dy[i] + cur.y;

                if(nx>=0 && nx<=n && ny>=0 && ny<=m){
                    if(vis[nx][ny] == 0 && maps[nx][ny] == 1){
                        q.add(new Cur(nx,ny));
                        vis[nx][ny] = vis[cur.x][cur.y] + 1;
                    }
                }
            }
        }
        
    }
}