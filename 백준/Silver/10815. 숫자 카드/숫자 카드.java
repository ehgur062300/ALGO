import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main {
    private static final HashSet<Integer> nums = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int n = 0; n < N; n++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        
        for (int m = 0; m < M; m++) {
            int question = Integer.parseInt(st.nextToken());
            bw.write(isExist(question) + " ");
        }

        bw.flush();
        bw.close();
    }

    private static int isExist(int question) {
        if (nums.contains(question)) {
            return 1;
        }
        return 0;
    }
}
