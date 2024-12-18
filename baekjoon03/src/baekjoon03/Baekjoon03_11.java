package baekjoon03;

import java.io.*;
import java.util.*;

public class Baekjoon03_11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num1 = 0;
		int num2 = 0;

		while (true) {
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());

			if (num1 == 0 && num2 == 0) {
				break;
			} else {
				bw.write(num1 + num2 + "\n");
				st = new StringTokenizer(br.readLine(), " ");
			}
		}

		bw.flush();
		bw.close();

	}

}
