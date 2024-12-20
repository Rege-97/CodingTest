package baekjoon05;

import java.io.*;

public class Baekjoon05_05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		String str = br.readLine();
		int arr[] = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = (int) str.charAt(i) - 48;
		}

		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

	}

}
