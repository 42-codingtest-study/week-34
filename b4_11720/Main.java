package b4_11720;
/*
 * <일의 자리 숫자의 나열을 문자열로 받아올 때>
 * 1. 가장 쉬운 방법 : str.toCharArray 로 문자 배열 만든후 한글자씩 '0'빼서 더함
 * 2. 비슷한 난이도 : str.charAt(0~str.length)로 한문자씩 접근
 * 3. StringTokenizer로 ""을 구분자로 하여 st.hasNext로 한글자씩 접근
 * 4. split 으로 찢어 사용
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		//System.out.println(str);
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += str.charAt(i) - '0';
		}
//		int i =0;
//		while(i < str.length()) {
//			sum += str.charAt(i) - '0';
//			i++;
//		}
		System.out.print(sum);
	}

}
