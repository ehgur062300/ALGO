import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    private static int circleCount, startX, startY, endX, endY, crossingCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCaseCount = Integer.parseInt(br.readLine());

        for (int t = 0; t < testCaseCount; t++) {
            crossingCount = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            startX = Integer.parseInt(st.nextToken());
            startY = Integer.parseInt(st.nextToken());
            endX = Integer.parseInt(st.nextToken());
            endY = Integer.parseInt(st.nextToken());
            circleCount = Integer.parseInt(br.readLine());

            for (int i = 0; i < circleCount; i++) {
                st = new StringTokenizer(br.readLine());

                int circleX = Integer.parseInt(st.nextToken());
                int circleY = Integer.parseInt(st.nextToken());
                int radius = Integer.parseInt(st.nextToken());

                checkInternal(circleX, circleY, radius);
            }
            sb.append(crossingCount).append("\n");
        }
        System.out.print(sb);
    }

    private static void checkInternal(int circleX, int circleY, int radius) {
        boolean isStartInside = (circleX - startX) * (circleX - startX) + (circleY - startY) * (circleY - startY) < radius * radius;
        boolean isEndInside = (circleX - endX) * (circleX - endX) + (circleY - endY) * (circleY - endY) < radius * radius;

        if (isStartInside != isEndInside) {
            crossingCount++;
        }
    }
}
