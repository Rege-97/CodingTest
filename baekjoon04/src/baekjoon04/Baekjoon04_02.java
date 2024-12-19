package baekjoon04;

import java.io.*;
import java.util.*;

public class Baekjoon04_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int arr[] = new int[a];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i <= arr.length - 1; i++) {
			String str = st.nextToken();
			arr[i] = Integer.parseInt(str);
		}
		for (int j = 0; j <= arr.length - 1; j++) {
			if (arr[j] < b) {
				bw.write(arr[j] + " ");
			}
		}
		bw.flush();
		bw.close();

	}

}
