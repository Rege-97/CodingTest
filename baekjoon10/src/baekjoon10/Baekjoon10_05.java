package baekjoon10;

import java.io.*;
import java.util.*;

public class Baekjoon10_05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int result = 0;
		int temp1[] = new int[num];
		int temp2[] = new int[num];

		int a = 0;
		int b = 0;

		if (num != 1) {

			for (int i = 0; i < num; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				temp1[i] = Integer.parseInt(st.nextToken());
				temp2[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(temp1);
			Arrays.sort(temp2);

			a = temp1[0] - temp1[num - 1];

			b = temp2[0] - temp2[num - 1];

			result = a * b;

			System.out.println(result);
		} else {

			for (int i = 0; i < num; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				temp1[i] = Integer.parseInt(st.nextToken());
				temp2[i] = Integer.parseInt(st.nextToken());
			}

			System.out.println(result);
		}

	}

}
