import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {

    private static int x,y,T,curT;
    private static String curState,dir;
    private static HashMap<String, String> map = new HashMap<>();

    static {
        map.put("x right", "-y"); map.put("-x right","y");
        map.put("x left","y"); map.put("-x left","-y");
        map.put("y right", "x"); map.put("-y right", "-x");
        map.put("y left", "-x"); map.put("-y left", "x");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        x = 0; y = 0;
        curT = 0;
        curState = "x";

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());

            int time = Integer.parseInt(st.nextToken());
            dir = st.nextToken();

            move(time);
        }
        move(T);
        System.out.print(x + " " + y);
    }

    private static void move(int time) {
        int d = time-curT;

        if (curState.equals("x")){
            x += d;
        } else if(curState.equals("-x")) {
            x -= d;
        } else if(curState.equals("y")) {
            y += d;
        } else {
            y -= d;
        }

        curT = time;
        curState = map.get(curState + " " + dir);
    }
}
