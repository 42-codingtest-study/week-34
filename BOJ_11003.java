import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_11003 {
    static class Node {
        public int index;
        public int value;

        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        Deque<Node> deque = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        for (int idx = 1; idx <= n; idx++) {
            int value = Integer.parseInt(st.nextToken());

            while (!deque.isEmpty() && deque.getLast().value > value) {
                deque.removeLast();
            }
            deque.addLast(new Node(idx, value));
            if (!deque.isEmpty() && (idx - deque.getFirst().index) >= l) {
                deque.removeFirst();
            }

            bw.write(deque.getFirst().value + " ");
        }
        bw.flush();
        bw.close();
    }

}
