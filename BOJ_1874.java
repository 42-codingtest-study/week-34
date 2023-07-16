import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874 {

    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder result;
        generateArr(br, n);

        BOJ_1874 validateStackPrinter = new BOJ_1874();
        result = validateStackPrinter.checkValidStack(new StringBuilder(), n, 1);
        validateStackPrinter.printResult(result);
    }
    private void printResult(StringBuilder result) {
        System.out.println(result);
    }

    private StringBuilder checkValidStack(StringBuilder sb, int n, int stackNum) {
        Stack<Integer> stack = new Stack<>();
        boolean flag = true;
        for (int idx = 0; idx < n; idx++) {
            if (arr[idx] >= stackNum) {
                while (arr[idx] >= stackNum) {
                    stack.push(stackNum++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            else if (arr[idx] < stackNum) {
                int topNum = stack.pop();
                if (arr[idx] > topNum) {
                    sb.setLength(0);
                    sb.append("NO");
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }
        return sb;
    }

    private static void generateArr(BufferedReader br, int n) throws IOException {
        arr = new int[n];
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = Integer.parseInt(br.readLine());
        }
    }
}
