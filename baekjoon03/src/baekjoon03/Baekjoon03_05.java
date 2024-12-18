package baekjoon03;

import java.util.Scanner;

public class Baekjoon03_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 4 == 0) {
				System.out.print("long ");
			}
		}
		System.out.println("int");

	}

}
