package baekjoon00;

import java.io.*;
import java.util.Arrays;

public class B1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[2];
		int arr_r[] = new int[2];
		String num_s = br.readLine();
		int num_i = Integer.parseInt(num_s);
		int count = 0;

		if (num_i >= 10) {
			arr[0] = num_s.charAt(0) - 48;
			arr[1] = num_s.charAt(1) - 48;
		} else {
			arr[0] = 0;
			arr[1] = num_s.charAt(0) - 48;
		}

		arr_r[0] = arr[0];
		arr_r[1] = arr[1];

		while (true) {
			int temp1 = arr[1];
			int temp2 = arr[0] + arr[1];

			if (temp2 >= 10) {
				temp2 %= 10;
			}
			arr[0] = temp1;
			arr[1] = temp2;
			count++;
			if (arr[0] == arr_r[0] && arr[1] == arr_r[1]) {
				break;
			}
		}
		System.out.println(count);
	}

}
