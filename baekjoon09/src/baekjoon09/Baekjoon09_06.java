package baekjoon09;

import java.io.*;

public class Baekjoon09_06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				num /= i;
				System.out.println(i);
				i--;
			}
		}

	}

}
