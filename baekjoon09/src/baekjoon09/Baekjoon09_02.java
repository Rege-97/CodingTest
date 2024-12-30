package baekjoon09;

import java.io.*;
import java.util.*;

public class Baekjoon09_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int count = 0;
		int arr[] = new int[num1];

		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0) {
				arr[count] = i;
				count++;
			}
		}
		System.out.println(arr[num2-1]);
		

	}

}
