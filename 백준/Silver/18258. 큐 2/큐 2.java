import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    private static Deque<String> dq = new ArrayDeque<>();
    private static String cmd;
    private static String value;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++) {
            cmd = br.readLine();

            if (checkBlank(cmd)) {
                String[] separateCmd = cmd.split(" ");
                cmd = separateCmd[0];
                value = separateCmd[1];
            }

            applyCmdInQueue(bw);
        }
        bw.flush();
        bw.close();
    }

    private static boolean checkBlank(String cmd) {
        return cmd.contains(" ");
    }

    private static void applyCmdInQueue(BufferedWriter bw) throws IOException {
        switch (cmd) {
            case "push":
                push();
                break;

            case "pop":
                bw.write(pop());
                bw.newLine();
                break;

            case "size":
                bw.write(size());
                bw.newLine();
                break;

            case "empty":
                bw.write(empty());
                bw.newLine();
                break;

            case "front":
                bw.write(front());
                bw.newLine();
                break;

            case "back":
                bw.write(back());
                bw.newLine();
                break;
        }
    }

    private static void push() {
        dq.add(value);
    }

    private static String pop() {
        String result = "-1";
        if (!dq.isEmpty()) {
            result = dq.removeFirst();
        }
        return result;
    }

    private static String size() {
        return String.valueOf(dq.size());
    }

    private static String empty() {
        String result = "0";
        if (dq.isEmpty()) {
            result = "1";
        }
        return result;
    }

    private static String front() {
        String result = "-1";
        if (!dq.isEmpty()) {
            result = dq.getFirst();
        }
        return result;
    }

    private static String back() {
        String result = "-1";
        if (!dq.isEmpty()) {
            result = dq.getLast();
        }
        return result;
    }
}
