import java.util.*;
import java.io.*;

public class Main {
    // 최대 위치 값
    public static final int MAX = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 수빈이의 위치 N과 동생의 위치 K를 입력받음
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 각 위치에 도달하는 데 걸리는 시간을 저장할 배열
        int[] time = new int[MAX + 1];
        Arrays.fill(time, -1); // 초기화

        // BFS를 위한 큐
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N); // 수빈이의 시작 위치를 큐에 추가
        time[N] = 0; // 시작 위치의 시간을 0으로 설정

        // BFS 실행
        while (!queue.isEmpty()) {
            int current = queue.remove();

            // 동생의 위치에 도달했다면 종료
            if (current == K) {
                break;
            }

            // 걷기와 순간이동을 통해 이동할 수 있는 위치를 큐에 추가
            int[] nextPositions = {current - 1, current + 1, current * 2};
            for (int next : nextPositions) {
                // 다음 위치가 유효 범위 내이고 아직 방문하지 않았다면
                if (next >= 0 && next <= MAX && time[next] == -1) {
                    queue.add(next);
                    time[next] = time[current] + 1; // 다음 위치에 도달하는 데 걸리는 시간을 저장
                }
            }
        }

        // 동생을 찾는 데 걸리는 시간 출력
        System.out.println(time[K]);
    }
}
