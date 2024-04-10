import java.util.Scanner;

public class Main {
    static Integer[][] nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        nums = new Integer[n+1][n+1];

        int result = binomialCoefficient(n,k);

        System.out.println(result);
    }
    private static int binomialCoefficient(int n, int k){
        if(k==0 || n == k){
            return 1;

        } if(nums[n][k] == null){
            nums[n][k] = binomialCoefficient(n-1,k-1) + binomialCoefficient(n-1,k);
        }
        return nums[n][k];
    }
}
