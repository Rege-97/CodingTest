package baekjoon00;

import java.io.*;

public class B2440 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
