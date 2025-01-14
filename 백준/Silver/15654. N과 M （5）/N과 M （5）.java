import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int N,M;
    private static boolean[] isVisited;
    private static StringBuilder sb = new StringBuilder();
    private static int[] arr, result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        arr = new int[N];
        result = new int[M];
        isVisited = new boolean[N];

        for (int n = 0; n < N; n++) {
            arr[n] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        dfs(0);
        System.out.println(sb);
    }

    private static void dfs(int depth) {
        if(depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(result[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int s = 0; s < N; s++) {
            if(!isVisited[s]) {
                isVisited[s] = true;
                result[depth] = arr[s];
                dfs(depth+1);
                isVisited[s] = false;
            }
        }
    }
}
