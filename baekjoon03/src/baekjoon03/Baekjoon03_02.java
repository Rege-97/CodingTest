package baekjoon03;

import java.util.Scanner;

public class Baekjoon03_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cas = sc.nextInt();
		int num1 = 0;
		int num2 = 0;

		for (int i = 1; i <= cas; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println(num1 + num2);
		}

	}

}
