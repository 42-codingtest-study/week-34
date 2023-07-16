import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_12891 {

    private static char[] arr;
    private static int[] prerequisiteArr;
    private static int[] reportArr;
    private static int result;
    private static int prerequisiteCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        prerequisiteArr = new int[4];
        reportArr = new int[4];
        result = 0;
        prerequisiteCount = 4;

        generateArr(br, s);
        generatePrerequisiteArr(br);

        BOJ_12891 validPasswordnumberPrinter = new BOJ_12891();

        validPasswordnumberPrinter.slidingWindow(s, p);
        printResult();
    }

    private static void printResult() {
        System.out.println(result);
    }

    private void slidingWindow(int s, int p) {
        for (int idx = 0; idx < p; idx++) {
            addWindow(idx);
        }

        if (prerequisiteCount == 0)
            result++;

        for (int tail_idx = p; tail_idx < s; tail_idx++) {
            int head_idx = tail_idx - p;

            addWindow(tail_idx);
            removeWindow(head_idx);
            if (prerequisiteCount == 0)
                result++;
        }
    }

    private static void generatePrerequisiteArr(BufferedReader br) throws IOException {
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for (int idx = 0; idx < 4; idx++) {
            prerequisiteArr[idx] = Integer.parseInt(st.nextToken());
            if (prerequisiteArr[idx] == 0)
                prerequisiteCount--;
        }
    }

    private static void generateArr(BufferedReader br, int s) throws IOException {
        arr = new char[s];
        arr = br.readLine().toCharArray();
    }

    private static void removeWindow(int head_idx) {
        switch (arr[head_idx]){
            case 'A':
                if (reportArr[0] == prerequisiteArr[0])
                    prerequisiteCount++;
                reportArr[0]--;
                break;
            case 'C':
                if (reportArr[1] == prerequisiteArr[1])
                    prerequisiteCount++;
                reportArr[1]--;
                break;
            case 'G':
                if (reportArr[2] == prerequisiteArr[2])
                    prerequisiteCount++;
                reportArr[2]--;
                break;
            case 'T':
                if (reportArr[3] == prerequisiteArr[3])
                    prerequisiteCount++;
                reportArr[3]--;
                break;
        }
    }

    private static void addWindow(int idx) {
        switch (arr[idx]){
            case 'A':
                reportArr[0]++;
                if (reportArr[0] == prerequisiteArr[0])
                    prerequisiteCount--;
                break;
            case 'C':
                reportArr[1]++;
                if (reportArr[1] == prerequisiteArr[1])
                    prerequisiteCount--;
                break;
            case 'G':
                reportArr[2]++;
                if (reportArr[2] == prerequisiteArr[2])
                    prerequisiteCount--;
                break;
            case 'T':
                reportArr[3]++;
                if (reportArr[3] == prerequisiteArr[3])
                    prerequisiteCount--;
                break;
        }
    }
}