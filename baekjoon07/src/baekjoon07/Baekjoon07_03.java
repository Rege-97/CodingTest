package baekjoon07;

import java.io.*;
import java.util.Arrays;

public class Baekjoon07_03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char arr[][] = new char[5][15];
		for (int i = 0; i < 5; i++) {
			String str = br.readLine();

			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if ((arr[j][i] >= 48 && arr[j][i] <= 57) || (arr[j][i] >= 65 && arr[j][i] <= 90)
						|| (arr[j][i] >= 97 && arr[j][i] <= 122)) {
					System.out.print(arr[j][i]);
				}
			}
		}

	}

}
