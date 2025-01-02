package baekjoon00;

import java.io.*;
import java.util.Arrays;

public class B2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int count[] = new int[2];
		int temp = num;

		if (temp / 5 != 0) {
			count[0] = temp / 5;
			temp = temp % 5;
			if (temp != 0) {
				count[0] = -1;
			}
		}

		temp = num;
		while (true) {
			if (temp / 3 != 0) {
				count[1]++;
				temp = temp - 3;
				if (temp % 5 == 0) {
					count[1] = count[1] + (temp / 5);
					break;
				}
			} else {
				count[1] = -1;
				break;
			}
		}

		Arrays.sort(count);

		int result = 0;

		if (count[0] <= 0) {
			if (count[1] <= 0) {
				result = -1;
			} else {
				result = count[1];
			}
		} else if (count[1] <= 0) {
			if (count[0] <= 0) {
				result = -1;
			} else {
				result = count[0];
			}
		} else if (count[0] <= count[1]) {
			result = count[0];
		} else {
			result = count[1];
		}

		System.out.println(result);
	}

}
