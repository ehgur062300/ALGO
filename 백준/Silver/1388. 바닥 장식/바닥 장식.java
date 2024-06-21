import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static int N,M,cnt=0;
    private static String[][] tile = new String[50][50];
    private static boolean[][] vis = new boolean[50][50];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int n=0; n<N; n++){
            tile[n] = br.readLine().split("");
        }
        check();
        System.out.print(cnt);
    }

    static void check() {
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(!vis[i][j]){
                    String t = tile[i][j];
                    cnt++;
                    dfs(i, j, t);
                }
            }
        }
    }

    static void dfs(int i, int j, String t){
        if(Objects.equals(t, tile[i][j])) {
            vis[i][j] = true;
            if(t.equals("-") && j+1<M){
                dfs(i, j+1, t);
            }
            if(t.equals("|") && i+1<N) {
                dfs(i+1, j, t);
            }
        }
    }
}
