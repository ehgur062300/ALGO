import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        System.out.print(solve(N));
    }

    private static int solve(String nums) {
        int sum = 0;
        StringBuilder temp = new StringBuilder();
        temp.append(nums.charAt(0));

        int i=1;
        while (i < nums.length()) {
            if (nums.charAt(i) != '0') {
                sum += Integer.parseInt(temp.toString());
                temp.setLength(0);
                temp.append(nums.charAt(i));
            }
            else {
                temp.append('0');
            }
            i++;
        }

        if(temp.length() > 0) {
            sum += Integer.parseInt(temp.toString());
        }
        return sum;
    }
}
