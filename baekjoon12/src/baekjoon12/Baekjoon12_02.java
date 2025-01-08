package baekjoon12;

import java.util.*;

public class Baekjoon12_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 0;
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			String a = i + "";
			for (int j = 0; j < a.length(); j++) {
				sum += (a.charAt(j) - 48);
			}

			if (i + sum == num) {
				result = i;
				break;
			} else {
				sum = 0;
			}
		}
		System.out.println(result);
	}

}
