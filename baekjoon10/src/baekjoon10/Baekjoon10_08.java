package baekjoon10;

import java.io.*;
import java.util.*;

public class Baekjoon10_08 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[3];
		int result = 0;

		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		arr[2] = Integer.parseInt(st.nextToken());

		Arrays.sort(arr);

		while (true) {
			if (arr[2] < arr[0] + arr[1]) {
				result = arr[0] + arr[1] + arr[2];
				break;
			} else {
				arr[2]--;
			}
		}
		System.out.println(result);

	}

}
