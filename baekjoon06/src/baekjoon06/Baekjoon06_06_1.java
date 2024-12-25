package baekjoon06;

import java.util.Scanner;

public class Baekjoon06_06_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'c' && i < str.length() - 1) {
				if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
					i++;
				}
				count++;
			} else if (str.charAt(i) == 'd') {
				if (i < str.length() - 2 && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
					i += 2;
				} else if (i < str.length() - 1 && str.charAt(i + 1) == '-') {
					i++;
				}
				count++;
			} else if (str.charAt(i) == 'l' && i < str.length() - 1) {
				if (str.charAt(i + 1) == 'j') {
					i++;
				}
				count++;
			} else if (str.charAt(i) == 'n' && i < str.length() - 1) {
				if (str.charAt(i + 1) == 'j') {
					i++;
				}
				count++;
			} else if (str.charAt(i) == 's' && i < str.length() - 1) {
				if (str.charAt(i + 1) == '=') {
					i++;
				}
				count++;
			} else if (str.charAt(i) == 'z' && i < str.length() - 1) {
				if (str.charAt(i + 1) == '=') {
					i++;
				}
				count++;
			} else {
				count++;
			}
		}
		System.out.println(count);

	}

}
