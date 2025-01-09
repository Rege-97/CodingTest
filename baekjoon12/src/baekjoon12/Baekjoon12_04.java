package baekjoon12;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Baekjoon12_04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		char arr[][] = new char[a][b];
		char arr3[][] = new char[a][b];
		char arr4[][] = { { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }, { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' } };

		for (int i = 0; i < a; i++) {
			String str = br.readLine();
			for (int j = 0; j < b; j++) {
				arr[i][j] = str.charAt(j);
				arr3[i][j] = str.charAt(j);
			}
		}

		int count = 0;
		for (int i = 0; i < a - 7; i++) {
			for (int j = 0; j < b - 7; j++) {
				count++;
				for (int k = i; k < i + 8; k++) {
					for (int z = j; z < k + 8; z++) {

					}
				}
			}
		}

		int arr2[] = new int[count*2];
		int num = 0;
		count = 0;
		int e = 0;

		for (int i = 0; i < a - 7; i++) {
			for (int j = 0; j < b - 7; j++) {
				if (arr3[i][j] == 'B') {
					e = 0;
				} else {
					e = 1;
				}
				for (int k = i; k < i + 8; k++) {
					int t = 0;

					for (int z = j; z < j + 8; z++) {
						if (arr3[k][z] != arr4[e][t]) {
							arr3[k][z] = arr4[e][t];
							count++;
						}
						t++;
					}
					if (e == 0) {
						e = 1;
					} else if (e == 1) {
						e = 0;
					}

				}
				arr2[num] = count;
				num++;
				count = 0;

				for (int q = 0; q < a; q++) {
					for (int w = 0; w < b; w++) {

						arr3[q][w] = arr[q][w];
					}
				}

			}
		}
		for (int i = 0; i < a - 7; i++) {
			for (int j = 0; j < b - 7; j++) {
				if (arr3[i][j] == 'W') {
					e = 0;
				} else {
					e = 1;
				}
				for (int k = i; k < i + 8; k++) {
					int t = 0;
					
					for (int z = j; z < j + 8; z++) {
						if (arr3[k][z] != arr4[e][t]) {
							arr3[k][z] = arr4[e][t];
							count++;
						}
						t++;
					}
					if (e == 0) {
						e = 1;
					} else if (e == 1) {
						e = 0;
					}
					
				}
				arr2[num] = count;
				num++;
				count = 0;

				
				for (int q = 0; q < a; q++) {
					for (int w = 0; w < b; w++) {
						
						arr3[q][w] = arr[q][w];
					}
				}
				
			}
		}
		Arrays.sort(arr2);
		System.out.println(arr2[0]);

	}

}
