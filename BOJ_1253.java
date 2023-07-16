import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1253 {

    private static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new long[n];

        generateArr(n, new StringTokenizer(br.readLine()));

        BOJ_1253 findNumberPrinter = new BOJ_1253();
        findNumberPrinter.printResult(findNumberPrinter.countFindNumber(n));
    }
    private void printResult(final long count) {
        System.out.println(count);
    }

    private long countFindNumber(int n) {
        Arrays.sort(arr);
        long count = 0;
        for (int cur = 0; cur < n; cur++) {
            long findNum = arr[cur];
            int start_idx = 0;
            int end_idx = n - 1;
            boolean find = false;
            long sum = 0;

            while (start_idx < end_idx) {
                if (start_idx == cur) {
                    start_idx++;
                    continue;
                }
                else if (end_idx == cur) {
                    end_idx--;
                    continue;
                }

                sum = arr[start_idx] + arr[end_idx];
                if (sum == findNum) {
                    find = true;
                    break;
                }
                else if (sum < findNum)
                    start_idx++;
                else if (sum > findNum)
                    end_idx--;
            }
            if (find)
                count++;
        }
        return count;
    }

    private static void generateArr(int n, StringTokenizer st) {
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = Long.parseLong(st.nextToken());
        }
    }
}
