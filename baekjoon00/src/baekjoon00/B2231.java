package baekjoon00;

import java.io.*;

public class B2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int temp = 0;
		int result = 0;

		for (int i = 1; i <= num; i++) {
			temp = i;
			String i_s = i + "";
			for (int j = 0; j < i_s.length(); j++) {
				temp += i_s.charAt(j) - 48;
			}
			if (temp == num) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
