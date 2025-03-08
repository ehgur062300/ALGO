import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    private static final String TRUE = "yes";
    private static final String FALSE = "no";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] input = new int[3];

            input[0] = Integer.parseInt(st.nextToken());
            input[1] = Integer.parseInt(st.nextToken());
            input[2] = Integer.parseInt(st.nextToken());

            bw.write("Scenario #"+(i+1)+":");
            bw.newLine();
            bw.write(solve(input));
            bw.newLine();
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    private static String solve(int[] line) {
        Arrays.sort(line);

        if (line[0]*line[0] + line[1]*line[1] == line[2]*line[2]) {
            return TRUE;
        }
        return FALSE;

    }
}
