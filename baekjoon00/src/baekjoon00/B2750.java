package baekjoon00;

import java.io.*;
import java.util.Arrays;

public class B2750 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		for (int i = 0; i < num; i++) {
			System.out.println(arr[i]);
		}

	}

}
