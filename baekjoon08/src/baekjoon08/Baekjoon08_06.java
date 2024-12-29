package baekjoon08;

import java.io.*;
import java.util.Arrays;

public class Baekjoon08_06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int arr[] = { 1, 1, 1 };
		int a = 1;

		while (true) {
			if (a != 1) {
				if (a % 2 == 0) {
					arr[1] = a;
					arr[0] = 1;
					arr[2]++;
					for (int i = 1; i < a; i++) {
						if (arr[2] == num) {
							break;
						}
						arr[0]++;
						arr[1]--;
						arr[2]++;

					}
				} else {
					arr[1] = 1;
					arr[0] = a;
					arr[2]++;
					for (int i = 1; i < a; i++) {
						if (arr[2] == num) {
							break;
						}
						arr[0]--;
						arr[1]++;
						arr[2]++;

					}
				}

			}
			if (arr[2] == num) {
				break;
			}
			a++;
		}
		System.out.println(arr[0] + "/" + arr[1]);

	}

}
