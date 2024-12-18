package baekjoon03;

import java.io.*;
import java.util.*;

public class Baekjoon03_07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cas = Integer.parseInt(st.nextToken());

		int num1 = 0;
		int num2 = 0;

		for (int i = 1; i <= cas; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());

			bw.write("Case #" + i + ": " + (num1 + num2) + "\n");
		}
		bw.flush();
		bw.close();

	}

}
