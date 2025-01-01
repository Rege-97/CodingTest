package baekjoon10;

import java.io.*;
import java.util.*;

public class Baekjoon10_07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int arr[] = new int[3];

		while (true) {
			int count = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());

			Arrays.sort(arr);

			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				break;
			}

			if (arr[0] == arr[1]) {
				count++;
			}
			if (arr[0] == arr[2]) {
				count++;
			}
			if (arr[1] == arr[2]) {
				count++;
			}
			

			if (arr[2] < arr[0] + arr[1]) {
				if (count == 3) {
					bw.write("Equilateral\n");
				} else if (count == 1) {
					bw.write("Isosceles\n");
				} else if (count == 0) {
					bw.write("Scalene\n");
				}
			}else {
				bw.write("Invalid\n");
			}

		}
		bw.flush();
		bw.close();
	}

}
