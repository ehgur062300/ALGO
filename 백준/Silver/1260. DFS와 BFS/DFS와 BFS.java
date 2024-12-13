import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
    private static int N; // 정점의 개수
    private static int M; // 간선의 개수
    private static int V; // 시작 정점
    private static final Map<Integer, List<Integer>> graph = new HashMap<>();

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            init(br);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            getResult(bw);
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    private static void init(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        // 그래프 초기화
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int key = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            graph.putIfAbsent(key, new ArrayList<>());
            graph.putIfAbsent(value, new ArrayList<>());
            graph.get(key).add(value);
            graph.get(value).add(key); // 무방향 그래프
        }

        // 각 인접 리스트를 정렬
        for (List<Integer> neighbors : graph.values()) {
            Collections.sort(neighbors);
        }
    }

    private static void getResult(BufferedWriter bw) throws IOException {
        bw.write(dfs(V));
        bw.newLine();
        bw.write(bfs(V));
        bw.flush();
        bw.close();
    }

    private static String dfs(int start) {
        StringBuilder result = new StringBuilder();
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start, visited, result);
        return result.toString().trim();
    }

    private static void dfsHelper(int node, Set<Integer> visited, StringBuilder result) {
        visited.add(node);
        result.append(node).append(" ");

        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited, result);
            }
        }
    }

    private static String bfs(int start) {
        StringBuilder result = new StringBuilder();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.offer(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.append(node).append(" ");

            for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        return result.toString().trim();
    }
}
