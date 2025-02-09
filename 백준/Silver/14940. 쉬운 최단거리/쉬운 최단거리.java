import java.io.*;
import java.util.*;

public class Main {

    private static int N,M;
    private static boolean[][] visited;
    private static int[][] map, result;

    private static int[] dirX = {1,0,-1,0};
    private static int[] dirY = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N][M];
        map = new int[N][M];
        result = new int[N][M];

        int x=0, y = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < M; j++) {
                visited[i][j] = false;
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 2){
                    x = i;
                    y = j;
                } else if(map[i][j] == 0){
                    visited[i][j] = true;
                }
            }
        }

        bfs(x,y);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    result[i][j] = -1;
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        visited[x][y] = true;

        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = temp[0] + dirX[i];
                int newY = temp[1] + dirY[i];
                if (newX >= 0 && newX < N && newY >= 0 && newY < M) {
                    if (!visited[newX][newY] && map[newX][newY] == 1) {
                        visited[newX][newY] = true;
                        result[newX][newY] = result[temp[0]][temp[1]] + 1;
                        queue.add(new int[]{newX,newY});
                    }
                }
            }
        }

    }
}
