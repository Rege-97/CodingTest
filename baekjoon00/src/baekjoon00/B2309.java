package baekjoon00;

import java.io.*;
import java.util.Arrays;

public class B2309 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[9];
		int arr2[] = new int[2];
		int sum = 0;

		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		Arrays.sort(arr);

		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - arr[i] - arr[j] == 100) {
					arr2[0] = i;
					arr2[1] = j;
				}
			}
		}

		for (int i = 0; i < 9; i++) {
			if (i != arr2[0] && i != arr2[1]) {
				System.out.println(arr[i]);
			}
		}

	}

}
