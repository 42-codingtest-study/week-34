package b4_11720;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class roto1248_oop {
	private int sum, n;
	private BufferedReader br;
	private String s;
	
	public static void main(String[] args) throws Exception {
		roto1248_oop roto1248_oop = new roto1248_oop();
		// TODO Auto-generated method stub
		roto1248_oop.method();
		
	}
	public void method() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		char [] arr = br.readLine().toCharArray();
		sum = 0;
		for(char x : arr) {
			sum += x - '0';
		}
		System.out.print(sum);
	}

}
