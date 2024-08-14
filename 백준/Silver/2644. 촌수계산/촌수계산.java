import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {

    private static int N, x, y;
    private static HashMap<Integer, List<Integer>> relatives = new HashMap<>();
    private static boolean[] visited;
    private static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (!relatives.containsKey(p))
                relatives.put(p, new ArrayList<>());

            if (!relatives.containsKey(c))
                relatives.put(c, new ArrayList<>());

            relatives.get(p).add(c);
            relatives.get(c).add(p);  // 양방향 관계 추가
        }

        visited = new boolean[N + 1];

        dfs(x, 0);

        System.out.println(result);
    }

    private static void dfs(int current, int count) {
        visited[current] = true;

        if (current == y) {
            result = count;
            return;
        }

        if (relatives.containsKey(current)) {
            for (int next : relatives.get(current)) {
                if (!visited[next]) {
                    dfs(next, count + 1);
                }
            }
        }
    }
}
