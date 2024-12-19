package baekjoon04;

import java.io.*;
import java.util.*;

public class Baekjoon04_06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int arr1[] = new int[a];

		for (int i = 0; i <= a - 1; i++) {
			arr1[i] = i + 1;
		}
		
		int count = 0;

		while (count != b) {
			st = new StringTokenizer(br.readLine());
			
			int arr2[] = new int[2];
			
			for (int i = 0; i < 2; i++) {
				String str = st.nextToken();
				arr2[i] = Integer.parseInt(str);
			}
			
			int temp = 0;
			
			temp = arr1[arr2[0] - 1];
			arr1[arr2[0] - 1] = arr1[arr2[1] - 1];
			arr1[arr2[1] - 1] = temp;
			
			count++;
		}
		for (int i = 0; i < a; i++) {
			bw.write(arr1[i] + " ");
		}
		bw.flush();
		bw.close();

	}

}
