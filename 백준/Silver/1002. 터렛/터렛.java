import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            double d = Math.sqrt((x1-x2)*(x1-x2) + ((y1-y2)*(y1-y2)));

            System.out.println(solve(d,r1,r2));
        }
    }

    private static int solve(double d, int r1, int r2) {
        if (d == 0 && r1 == r2) {
            return -1;
        } else if (d == (double)(r1 + r2) || d == Math.abs(r1 - r2)) {
            return 1;
        } else if (d > (double)(r1 + r2) || d < Math.abs(r1 - r2)) {
            return 0;
        } else {
            return 2;
        }
    }
}
