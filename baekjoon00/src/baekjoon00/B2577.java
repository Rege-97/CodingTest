package baekjoon00;

import java.io.*;

public class B2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());
		String result = (num1 * num2 * num3) + "";

		int arr[] = new int[10];

		for (int i = 0; i < result.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if ((result.charAt(i) - 48) == j) {
					arr[j]++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
