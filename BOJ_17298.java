import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_17298 {

    private static int[] inputArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();

        inputArr = new int[n];

        for (int idx = 0; idx < n; idx++) {
            inputArr[idx] = Integer.parseInt(st.nextToken());
        }
        for (int idx = n - 1; idx >= 0; idx--) {
            while (!stack.isEmpty() && inputArr[stack.peek()] < inputArr[idx])
                inputArr[stack.pop()] = inputArr[idx];
            stack.push(idx);
        }

        while (!stack.isEmpty()) {
            inputArr[stack.pop()] = -1;
        }

        for (int idx = 0; idx < n; idx++) {
            System.out.print(inputArr[idx] + " ");
        }
    }
}
