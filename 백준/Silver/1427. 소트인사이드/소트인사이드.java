import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String number = br.readLine();
        char[] charArr = number.toCharArray();

        Arrays.sort(charArr);

        System.out.print(new StringBuilder(String.valueOf(charArr)).reverse());
    }
}
