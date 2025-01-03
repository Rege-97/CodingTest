package baekjoon00;

import java.io.*;

public class B10870 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[num + 1];

		if (num > 1) {
			arr[0] = 0;
			arr[1] = 1;

			for (int i = 2; i <= num; i++) {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		} else if (num == 1) {
			arr[1] = 1;
		}
		System.out.println(arr[num]);

	}

}
