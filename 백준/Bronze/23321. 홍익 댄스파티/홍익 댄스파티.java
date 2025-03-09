import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;

class Main {

    private static int col;
    private static String[][] photo = new String[5][10000];
    private static char[][] result;
    private static final Map<String,String> students = Map.of(
            ".omln", "owln.",
            "owln.", ".omln",
            "..oLn", "..oLn"
    );


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<5; i++) {
            String input = br.readLine();
            if (i==0){
                col = input.length();
            }
            photo[i] = input.split("");
        }

        result = new char[5][col];
        solve(result);
        printResult(result);

    }

    private static void solve(char[][] result) {
        for (int i=0; i<col; i++) {
            String temp = photo[0][i] + photo[1][i] + photo[2][i] + photo[3][i] + photo[4][i];
            String convert = students.get(temp);

            for (int j=0; j<5; j++) {
                result[j][i] = convert.charAt(j);
            }
        }
    }

    private static void printResult(char[][] result) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i=0; i<5; i++) {
            for (int j=0; j<col; j++) {
                bw.write(result[i][j]);
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
