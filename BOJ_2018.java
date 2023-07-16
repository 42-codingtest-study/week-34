import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2018 {
    private static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        generateArr(n);

        BOJ_2018    consecutiveSumCounter = new BOJ_2018();
        printResult(consecutiveSumCounter.countConsecutiveSum(n));
    }

    private static void    printResult(final int count) {
        System.out.println(count);
    }

    private int    countConsecutiveSum(int n) {
        int start_idx = 1;
        int end_idx = 1;
        int sum = 1;
        int count = 1;

        while (end_idx != n) {
            if (sum < n) {
                end_idx++;
                sum += end_idx;
            }
            else if (sum == n) {
                end_idx++;
                sum += end_idx;
                count++;
            }
            else if (sum > n) {
                sum -= start_idx;
                start_idx++;
            }
        }
        return count;
    }

    private static void generateArr(int n) {
        arr = new int[n + 1];
        for (int idx = 1; idx <= n; idx++) {
            arr[idx] = idx;
        }
    }

}
