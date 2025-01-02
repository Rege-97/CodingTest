package baekjoon00;

import java.io.*;
import java.util.*;

public class B1920 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int arr_n[] = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr_n[i] = Integer.parseInt(st.nextToken());
		}

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int arr_m[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr_m[i] = Integer.parseInt(st.nextToken());
		}

		int arr_c[] = new int[m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr_m[i] == arr_n[j]) {
					arr_c[i]++;
					break;
				}
			}
		}

		for (int i = 0; i < m; i++) {
			System.out.println(arr_c[i]);
		}
	}

}
