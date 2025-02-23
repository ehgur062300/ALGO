import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    private static int n,m;
    private static int[] seq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        seq = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print((solve()));
    }

    private static int solve() {
        int start = 0, sum = 0, count = 0;
        for (int end = 0; end < n; end++) {
            sum += seq[end];

            // sum이 m을 초과할 때까지 start 포인터 이동
            while (sum > m && start <= end) {
                sum -= seq[start];
                start++;
            }

            // sum이 m일 때 카운트 증가
            if (sum == m) {
                count++;
            }
        }
        return count;
    }

}
