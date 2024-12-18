package baekjoon03;

import java.util.Scanner;

public class Baekjoon03_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = sc.nextInt();
		int pcs = sc.nextInt();

		int price = 0;
		int ea = 0;
		for (int i = 1; i <= pcs; i++) {
			price = sc.nextInt();
			ea = sc.nextInt();

			sum -= (price * ea);
		}
		if (sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
