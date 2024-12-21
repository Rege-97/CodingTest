package baekjoon05;

import java.io.*;
import java.util.Arrays;

public class Baekjoon05_06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int arr[] = new int[26];
		char arr2[] = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 97;
		}

		for (int i = 0; i < str.length(); i++) {
			arr2[i] = str.charAt(i);
		}
		int count[] = new int[26];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr2[i] == arr[j]) {
					arr[j] = i;
					count[j]++;
				}
				if (i == arr2.length - 1 && arr[j] >= 97 && count[j] == 0) {
					arr[j] = -1;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
