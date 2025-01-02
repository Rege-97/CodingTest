package baekjoon00;

import java.io.*;

public class B10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int result = 1;

		for (int i = 1; i <= num; i++) {
			result *= i;
		}

		System.out.println(result);

	}

}
