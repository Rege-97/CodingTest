package baekjoon03;

import java.io.*;
import java.util.*;

public class Baekjoon03_12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input1 = "";

		while ((input1 = br.readLine()) != null) {
			st = new StringTokenizer(input1, " ");

			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());

			bw.write(num1 + num2+"\n");

		}
		bw.flush();
		bw.close();

	}

}
