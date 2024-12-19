package baekjoon04;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Baekjoon04_08 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int arr[] = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < 10; i++) {
			arr[i] = arr[i] % 42;
		}
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (arr[i] == arr[j]) {
					count++;
					i++;
				}
			}
		}
		System.out.println(10 - count);
	}

}
