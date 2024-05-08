import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int[] nums = new int[t];
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> indexMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < t; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            set.add(nums[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        // 정렬된 배열을 사용하여 각 숫자의 인덱스를 매핑합니다.
        int idx = 0;
        for(int num : list) {
            // 중복된 값에 대해서는 가장 낮은 인덱스를 매핑합니다.
            if(!indexMap.containsKey(num))
                indexMap.put(num,idx++);
        }

        //원본 배열의 순서대로 해당 압축 배열을 출력
        StringBuilder sb = new StringBuilder();
        for(int value : nums){
            sb.append(indexMap.get(value)).append(' ');
        }

        System.out.println(sb);

    }
}
