import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1940 {
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        arr = new int[n];

        generateArr(n, new StringTokenizer(br.readLine()));

        BOJ_1940    piecesOfArmorPrinter = new BOJ_1940();
        printResult(piecesOfArmorPrinter.countPiecesOfArmor(n, m));


    }

    private static void printResult(final long count) {
        System.out.println(count);
    }

    private long countPiecesOfArmor(int n, int m) {
        long count = 0;
        int start_idx = 0;
        int end_idx = n - 1;
        int sum;

        Arrays.sort(arr);

        while (start_idx < end_idx) {
            sum = arr[start_idx] + arr[end_idx];
            if (sum < m) {
                start_idx++;
            }
            else if (sum > m) {
                end_idx--;
            }
            else if (sum == m) {
                start_idx++;
                end_idx--;
                count++;
            }
        }
        return count;
    }

    private static void generateArr(int n, StringTokenizer st) {
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = Integer.parseInt(st.nextToken());
        }
    }
}
