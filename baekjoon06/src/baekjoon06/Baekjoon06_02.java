package baekjoon06;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon06_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int arr1[] = new int[6];
		int arr2[] = { 1, 1, 2, 2, 2, 8 };

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > arr2[i]) {
				arr2[i] = -(arr1[i] - arr2[i]);
			} else if (arr1[i] < arr2[i]) {
				arr2[i] = arr2[i] - arr1[i];
			} else {
				arr2[i] = 0;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

}
