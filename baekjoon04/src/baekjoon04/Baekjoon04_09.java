package baekjoon04;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon04_09 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int arr[] = new int[a];

		for (int i = 0; i < a; i++) {
			arr[i] = i + 1;
		}
		int temp = 0;
		for (int i = 0; i < b; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			for (int z = d - 1; z >= 0; z--) {
				for (int j = c - 1; j < z; j++) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < a; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
