import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {

    private static int len,D,M;
    private static HashMap<Character, Integer> map = new HashMap<>();

    static {
        map.put('H', 0);
        map.put('Y', 0);
        map.put('U', 0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        len = Integer.parseInt(br.readLine());
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine());
        D = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        usedEnergy(str);
        amountHYU();
    }

    private static void usedEnergy(String str) {
        int energy = 0;
        int cnt = 0;

        for (int i=0; i<len; i++) {
            char curChar = str.charAt(i);
            if (map.containsKey(curChar)) {
                energy += applyEnergy(cnt);
                cnt = 0;

                int charCnt = map.get(curChar);
                map.replace(curChar,charCnt+1);
                continue;
            }
            cnt++;
        }
        if(cnt != 0) {
            energy += applyEnergy(cnt);
        }

        if (energy != 0) {
            System.out.println(energy);
            return;
        }
        System.out.println("Nalmeok");
    }

    private static int applyEnergy(int cnt) {
        return Math.min(cnt*D,D+M);
    }

    private static void amountHYU() {
        int H = map.get('H');
        int Y = map.get('Y');
        int U = map.get('U');

        if (H == 0 || Y == 0 || U == 0) {
            System.out.print("I love HanYang University");
            return;
        }
        System.out.print(Math.min(H, Math.min(Y,U)));

    }
}