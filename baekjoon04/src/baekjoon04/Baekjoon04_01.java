package baekjoon04;

import java.io.*;
import java.util.*;

public class Baekjoon04_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int[] arr = new int[a];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i <= arr.length - 1; i++) {
			String str = st.nextToken();
			arr[i] = Integer.parseInt(str);
		}

		st = new StringTokenizer(br.readLine(), " ");
		int b = Integer.parseInt(st.nextToken());
		int count = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == b) {
				count++;
			}
		}
		System.out.println(count);

	}

}
