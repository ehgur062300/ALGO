import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder a = new StringBuilder();
        a.append(st.nextToken());

        StringBuilder b = new StringBuilder();
        b.append(st.nextToken());

        System.out.printf(solve(a,b));

    }

    private static String solve(StringBuilder a, StringBuilder b) {
        StringBuilder result = new StringBuilder();

        a.reverse();
        b.reverse();

        int max_len = Math.max(a.length(), b.length());

        for (int i=0; i<max_len; i++) {
            if (i+1 > a.length()) {
                result.append(b.charAt(i));

            } else if (i+1 > b.length()) {
                result.append(a.charAt(i));

            } else {
                int num = (a.charAt(i)-'0') + (b.charAt(i) - '0');
                
                if (num == 0) {
                    result.append(0);
                    continue;
                }

                while(num != 0) {
                    int n = num % 10;
                    num /= 10;
                    result.append(n);
                }
            }
        }

        return result.reverse().toString();
    }
}
