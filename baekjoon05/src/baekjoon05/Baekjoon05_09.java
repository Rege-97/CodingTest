package baekjoon05;

import java.util.*;

public class Baekjoon05_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();
		String str2 = sc.next();

		char arr1[] = new char[str1.length()];
		char arr2[] = new char[str2.length()];

		for (int i = 0; i < str1.length(); i++) {
			arr1[i] = str1.charAt(str1.length() - 1 - i);
		}
		for (int i = 0; i < str2.length(); i++) {
			arr2[i] = str2.charAt(str2.length() - 1 - i);
		}

		str1 = new String(arr1);
		str2 = new String(arr2);

		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}

	}

}
