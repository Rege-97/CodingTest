package baekjoon06;

import java.io.*;

public class Baekjoon06_03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int num2 = 1;
		int count = 0;

		for (int i = 1; i <= num; i++) {
			for (int j = i; j <= num - 1; j++) {
				System.out.print("-");
			}
			for (int z = i; z <= num2; z++) {
				System.out.print("*");
			}
			System.out.println();
			num2 += 3;
		}
		num2=1;
		int num3 = 1;
		num2 = ((num - 1) * 2) - 1;
		for (int i = 1; i <= num - 1; i++) {
			for (int j = i; j <= num3; j++) {
				System.out.print("-");
			}
			for (int z = i; z <= num2; z++) {
				System.out.print("*");
			}
			System.out.println();
			num3 += 2;
			num2 += 3;
		}

	}

}
