package baekjoon09;

import java.io.*;
import java.util.*;

public class Baekjoon09_04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		int cnt = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= test; i++) {
			int num1 = Integer.parseInt(st.nextToken());
			int count = 0;

			for (int j = 1; j <= num1; j++) {
				if (num1 % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
