package baekjoon04;

import java.io.*;
import java.util.*;

public class Baekjoon04_05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int arr1[] = new int[a];
		for (int i = 0; i <= a - 1; i++) {
			arr1[i] = 0;
		}

		int count = 0;
		while (count != b) {
			int arr2[] = new int[3];
			st = new StringTokenizer(br.readLine());

			for (int i = 0; i <= 2; i++) {
				String str = st.nextToken();
				arr2[i] = Integer.parseInt(str);
			}
			for (int j = arr2[0]; j <= arr2[1]; j++) {
				arr1[j - 1] = arr2[2];
			}
			count++;
		}
		for (int i = 0; i <= arr1.length - 1; i++) {
			bw.write(arr1[i] + " ");
		}
		bw.flush();
		bw.close();

	}

}
