import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int N, M;
    public static int[] sequence = new int[8]; // 수열을 저장하는 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        findNonDuplicateSequence(1, 0, bw); // 수열 생성 시작
        bw.close();
    }

    private static void findNonDuplicateSequence(int start, int depth, BufferedWriter bw) throws IOException {
        // 현재 선택된 숫자의 개수가 M일 때 수열 출력
        if (depth == M) {
            printSequence(bw);
            return;
        }

        // start부터 N까지의 숫자 중에서 선택
        for (int j = start; j <= N; j++) {
            sequence[depth] = j; // 현재 숫자 선택
            findNonDuplicateSequence(j + 1, depth + 1, bw); // 다음 숫자 선택
        }
    }

    private static void printSequence(BufferedWriter bw) throws IOException {
        for (int i = 0; i < M; i++) {
            bw.write(sequence[i] + " "); // 선택된 수열 출력
        }
        bw.newLine(); // 줄바꿈
    }
}
