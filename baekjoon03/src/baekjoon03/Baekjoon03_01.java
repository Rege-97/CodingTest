package baekjoon03;

import java.util.Scanner;

public class Baekjoon03_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int user = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(user + " * " + i + " = " + (user * i));
		}

	}

}
