package baekjoon06;

import java.io.*;
import java.util.Arrays;

public class Baekjoon06_05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char arr[] = new char[str.length()];
		int num1 = arr.length;
		int count[] = new int[num1];

		for (int i = 0; i < num1; i++) {
			if (str.charAt(i) >= 97) {
				arr[i] = str.charAt(i);
				arr[i] -= 32;
			} else {
				arr[i] = str.charAt(i);
			}
		}

		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count[i]++;
					count[j]++;
				}
			}
		}

		int temp_i = 0;
		char temp_c = 'a';
		for (int i = 0; i < num1; i++) {
			for (int j = i + 1; j < num1; j++) {
				if (count[i] < count[j]) {
					temp_i = count[i];
					count[i] = count[j];
					count[j] = temp_i;

					temp_c = arr[i];
					arr[i] = arr[j];
					arr[j] = temp_c;
				}
			}
		}
		int num = count[0] / 2;

		if (count[0] == count[num] && arr[0] != arr[num]) {
			System.out.println("?");
		} else {
			System.out.println((char) (arr[0]));
		}

	}

}
