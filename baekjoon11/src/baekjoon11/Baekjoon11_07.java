package baekjoon11;

import java.util.*;

public class Baekjoon11_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a_1 = sc.nextInt();
		int a_0 = sc.nextInt();
		int c = sc.nextInt();
		int n_0 = sc.nextInt();

		int result = 0;

		if ((a_1 * n_0) + a_0 <= c * n_0 && c >= a_1) {
			result = 1;
		} else {
			result = 0;
		}

		System.out.println(result);

	}

}
