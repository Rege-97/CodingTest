package baekjoon06;

import java.io.*;
import java.util.Arrays;

public class Baekjoon06_05_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int arr[][] = new int[2][26];
		char arr1[] = new char[str.length()];
		int strlength = str.length();
		int alp = 65;

		for (int i = 0; i < 26; i++) {
			arr[1][i] = alp;
			alp++;
		}

		for (int i = 0; i < strlength; i++) {
			if (str.charAt(i) >= 97) {
				arr1[i] = str.charAt(i);
				arr1[i] -= 32;
			} else {
				arr1[i] = str.charAt(i);
			}
		}

		for (int i = 0; i < strlength; i++) {
			for (int j = 0; j < 26; j++) {
				if ((int) (arr1[i]) == arr[1][j]) {
					arr[0][j]++;
				}
			}
		}
		int temp1 = 0;
		int temp2 = 0;

		for (int i = 0; i < 26; i++) {
			for (int j = i + 1; j < 26; j++) {
				if (arr[0][i] < arr[0][j]) {
					temp1 = arr[0][i];
					arr[0][i] = arr[0][j];
					arr[0][j] = temp1;

					temp2 = arr[1][i];
					arr[1][i] = arr[1][j];
					arr[1][j] = temp2;
				}
			}
		}
		if (arr[0][0] == arr[0][1]) {
			System.out.println("?");
		} else {
			System.out.println((char) arr[1][0]);
		}

	}

}
