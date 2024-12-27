package baekjoon07;

import java.io.*;
import java.util.*;

public class Baekjoon07_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[][] = new int[9][9];

		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int arr1[][] = new int[3][9];

		for (int i = 0; i < 9; i++) {
			int count = 0;
			for (int j = 0; j < 9; j++) {

				for (int z = j + 1; z < 9; z++) {
					if (arr[i][j] < arr[i][z]) {
						break;
					} else {
						count++;
					}
				}

				if (count == 8 - j) {
					arr1[0][i] = arr[i][j];
					arr1[1][i] = j + 1;
					arr1[2][i] = i + 1;

					break;
				}
				count = 0;

			}
		}

		int temp1 = 0;
		int temp2 = 0;
		int temp3 = 0;

		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (arr1[0][i] < arr1[0][j]) {
					temp1 = arr1[0][i];
					arr1[0][i] = arr1[0][j];
					arr1[0][j] = temp1;

					temp2 = arr1[1][i];
					arr1[1][i] = arr1[1][j];
					arr1[1][j] = temp2;

					temp3 = arr1[2][i];
					arr1[2][i] = arr1[2][j];
					arr1[2][j] = temp3;
				}
			}
		}

		System.out.println(arr1[0][0]);
		System.out.println(arr1[2][0] + " " + arr1[1][0]);

	}

}
