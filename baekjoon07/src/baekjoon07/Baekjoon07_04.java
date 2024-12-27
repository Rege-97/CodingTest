package baekjoon07;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon07_04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		boolean arr[][] = new boolean[100][100];
		int num = Integer.parseInt(st.nextToken());

		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			int paper1 = Integer.parseInt(st.nextToken());
			int paper2 = Integer.parseInt(st.nextToken());

			for (int j = paper1 - 1; j < 10 + paper1 - 1; j++) {
				for (int z = paper2 - 1; z < 10 + paper2 - 1; z++) {
					arr[j][z] = true;
				}
			}

		}

		int count = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (arr[i][j] == true) {
					count++;
				}
			}
		}

		System.out.println(count);

	}

}
