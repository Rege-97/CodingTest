package baekjoon04;

import java.io.*;

public class Baekjoon04_04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int arr[] = new int[9];

		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int max = arr[0];
		int count = 0;
		for (int j = 0; j <= arr.length - 1; j++) {
			if (arr[j] >= max) {
				max = arr[j];
				count = j + 1;
			}
		}
		bw.write(max + "\n");
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}

}
