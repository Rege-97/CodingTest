package baekjoon03;

import java.util.Scanner;

public class Baekjoon03_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
