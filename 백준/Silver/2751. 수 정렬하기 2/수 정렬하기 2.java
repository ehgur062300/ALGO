import java.io.*;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeSet<Integer> treeSet = new TreeSet<>();

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            int num = Integer.parseInt(br.readLine());
            treeSet.add(num);
        }
        for (Integer num : treeSet) {
            bw.write(String.valueOf(num));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}