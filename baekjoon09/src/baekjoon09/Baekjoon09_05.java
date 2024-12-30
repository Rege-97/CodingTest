package baekjoon09;

import java.io.*;

public class Baekjoon09_05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int arr[] = new int[num2 - num1 + 1];
		int sum = 0;
		int cnt = 0;
		int a = 0;
		for (int i = num1; i <= num2; i++) {
			int count = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				sum += i;
				cnt++;
				arr[a] = i;
				a++;
			}

		}

		if (cnt != 0) {
			System.out.println(sum);
			System.out.println(arr[0]);
		} else {
			System.out.println("-1");
		}
	}

}
