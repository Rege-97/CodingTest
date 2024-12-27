package baekjoon07;

import java.io.*;
import java.util.*;

public class Baejoon07_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());

		int arr1[][] = new int[num1][num2];
		int arr2[][] = new int[num1][num2];

		for (int i = 0; i < arr1.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr1[0].length; j++) {
				arr1[i][j] = Integer.parseInt(st.nextToken());
			}

		}

		for (int i = 0; i < arr2.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr2[0].length; j++) {
				arr2[i][j] = Integer.parseInt(st.nextToken());
			}

		}
		int arr3[][] = new int[num1][num2];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}

		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}

	}

}
