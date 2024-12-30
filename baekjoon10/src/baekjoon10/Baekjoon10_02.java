package baekjoon10;

import java.io.*;
import java.util.*;

public class Baekjoon10_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		double hw = w / 2.0;
		double hh = h / 2.0;

		int result_x = 0;
		int result_y = 0;

		if (hw < x) {
			result_x = w - x;
		} else {
			result_x = x;
		}

		if (hh < y) {
			result_y = h - y;
		} else {
			result_y = y;
		}

		if (result_x < result_y) {
			System.out.println(result_x);
		} else {
			System.out.println(result_y);
		}
	}

}
