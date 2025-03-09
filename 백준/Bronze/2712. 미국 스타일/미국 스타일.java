import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {

    private static final String KILOGRAM = "kg";
    private static final String POUND = "lb";
    private static final String LITER = "l";
    private static final String GALLON = "g";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double num = Double.parseDouble(st.nextToken());
            String unit = st.nextToken();

            bw.write(solve(num, unit));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static String solve(double num, String unit) {
        switch (unit) {
            case KILOGRAM:
                return String.format("%.4f", num * 2.2046) + " " + POUND;
            
            case POUND:
                return String.format("%.4f", num * 0.4536) + " " + KILOGRAM;
            
            case LITER:
                return String.format("%.4f", num * 0.2642) + " " + GALLON;
            
            case GALLON:
                return String.format("%.4f", num * 3.7854) + " " + LITER;
        
            default:
                return "error";
        }
    }
}
