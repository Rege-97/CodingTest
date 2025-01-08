package baekjoon12;

import java.util.*;

public class Baekjoon12_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j+ 1; k < arr.length; k++) {
					count++;
				}
			}
		}

		int arr2[] = new int[count];

		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					arr2[cnt] = arr[i] + arr[j] + arr[k];
					cnt++;
				}
			}
		}

		Arrays.sort(arr2);
		int result = 0;

		for (int i = 0; i < cnt; i++) {
			if (m <= arr2[i]) {
				if (arr2[i] == m) {
					result = arr2[i];
					break;
				} else {
					result = arr2[i - 1];
					break;
				}
			}
		}
		if (result == 0) {
			result = arr2[cnt - 1];
		}
		System.out.println(result);

	}

}
