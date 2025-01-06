package baekjoon11;

import java.util.Scanner;

public class Baekjoon11_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextInt();
		long sum = 0;

		for (int i = 1; i < a; i++) {
			sum += i;
		}

		System.out.println(sum);
		System.out.println(2);

	}

}
