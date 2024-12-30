package baekjoon09;

import java.io.*;
import java.util.*;

public class Baekjoon09_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num1 = 0;
		int num2 = 0;

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());

			if (num1 == 0 && num2 == 0) {
				break;
			}

			if (num1 < num2) {
				if (num2 % num1 == 0) {
					bw.write("factor\n");
				} else {
					bw.write("neither\n");
				}
			} else if (num1 > num2) {
				if (num1 % num2 == 0) {
					bw.write("multiple\n");
				} else {
					bw.write("neither\n");
				}
			} 

		}
		bw.flush();
		bw.close();
	}

}
