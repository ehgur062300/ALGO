import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    private static int temp,B,C,D,E;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        temp = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
        D = Integer.parseInt(br.readLine());
        E = Integer.parseInt(br.readLine());

        System.out.print(solve());
    }

    private static int solve() {
        int time = 0;

        if (temp < 0) {
            time += (C * temp * -1);
            temp = 0;

        } if (temp == 0) {
            time += D;

        }
        time += ((B-temp)*E);

        return time;
    }
}
