package b1_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(s);
		int i = 0;
		while(st.hasMoreTokens()) {
			arr[i] = Integer.valueOf(st.nextToken());
			i++;
		}
		int max = 0, sum = 0;
		for(int x : arr) {
			max = Math.max(max, x);
			sum += x;
		}
		System.out.print(sum * (100 / (double)max) / n);
//		}
//		double[] arr2 = new double[n];
//		for(i = 0; i < n; i++) {
//			arr2[i] = arr[i] * (100 / (double)max);
//		}
//		double sum = 0;
//		for(double x:arr2) {
//			sum += x;
//		}
//		System.out.print((sum / (double)n));
	}

}
