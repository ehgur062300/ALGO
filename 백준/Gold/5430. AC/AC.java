import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            String cmd = br.readLine();
            int arrLength = Integer.parseInt(br.readLine());

            String[] arr = convert(br.readLine());

            if(count_cmd_D(cmd) > arrLength){
                bw.write("error");
                bw.newLine();
                continue;
            }

            int start = 0, end = arrLength-1;
            boolean reverseType = false;
            int cmdLength = cmd.length();
            for(int i=0; i<cmdLength; i++){
                if(cmd.charAt(i) == 'R'){
                    reverseType = !reverseType;
                } else if(cmd.charAt(i) == 'D'){
                    if(reverseType){ end--; }
                    else { start++; }
                }
            }

            bw.write(print_arr(arr,start,end,reverseType));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static int count_cmd_D(String cmd){
        int cnt_D = 0;
        int len = cmd.length();
        char cur;

        for(int i=0; i<len; i++){
            cur = cmd.charAt(i);
            if(cur == 'D'){ cnt_D++; }
        }

        return cnt_D;
    }

    private static String[] convert(String arr){
        char cur;
        int len = arr.length();
        StringBuilder sb = new StringBuilder();
        String[] result;

        for(int i=1; i<len-1; i++){
            cur = arr.charAt(i);
            sb.append(cur);
        }

        result = sb.toString().split(",");

        return result;
    }

    private static String print_arr(String[] arr, int start, int end, boolean reverseType){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if(reverseType){
            for(int i=end; i>=start; i--){
                sb.append(arr[i]);
                if(i != start)
                    sb.append(",");
            }
        } else {
            for(int i=start; i<=end; i++){
                sb.append(arr[i]);
                if(i != end)
                    sb.append(",");
            }
        }

        sb.append("]");

        return sb.toString();
    }
}
