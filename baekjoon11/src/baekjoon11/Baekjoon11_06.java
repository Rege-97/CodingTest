package baekjoon11;

import java.util.Scanner;

public class Baekjoon11_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		long arr[] = new long[a];
		long sum = 0;

		long result = 0;
		for (int i = 1; i <= a - 2; i++) {
			sum += i;
			arr[i - 1] = sum;
		}
		for (int i = 1; i <= a - 2; i++) {
			result += arr[i - 1];
		}
		System.out.println(result);
		System.out.println(3);
	}

}
