package baekjoon04;

import java.io.*;
import java.util.Arrays;

public class Baekjoon04_07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[30];

		for (int i = 0; i < 28; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);

		int count = 0;
		int j = 2;

		for (int i = 1; i < 30; i++) {
			if (count == 2) {
				break;
			}
			if (arr[j] != i) {
				System.out.println(i);
				i++;
				count++;
			}
			j++;

		}
		if (arr[29] == 29) {
			System.out.println("30");
		}
	}

}
