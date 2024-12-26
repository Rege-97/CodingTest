package baekjoon06;

import java.io.*;
import java.util.*;

public class Baekjoon06_08 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[][] = new String[20][3];
		double arr[][] = new double[20][2];
		for (int i = 0; i < 20; i++) {

			String str1 = br.readLine();
			StringTokenizer st = new StringTokenizer(str1, " ");
			str[i][0] = st.nextToken();
			str[i][1] = st.nextToken();
			str[i][2] = st.nextToken();

		}
		for (int i = 0; i < 20; i++) {
			arr[i][0] = Double.parseDouble(str[i][1]);
			if (str[i][2].equals("A+")) {
				arr[i][1] = 4.5;
			} else if (str[i][2].equals("A0")) {
				arr[i][1] = 4.0;
			} else if (str[i][2].equals("B+")) {
				arr[i][1] = 3.5;
			} else if (str[i][2].equals("B0")) {
				arr[i][1] = 3.0;
			} else if (str[i][2].equals("C+")) {
				arr[i][1] = 2.5;
			} else if (str[i][2].equals("C0")) {
				arr[i][1] = 2.0;
			} else if (str[i][2].equals("D+")) {
				arr[i][1] = 1.5;
			} else if (str[i][2].equals("D0")) {
				arr[i][1] = 1.0;
			} else if (str[i][2].equals("F")) {
				arr[i][1] = 0.0;
			} else if (str[i][2].equals("P")) {
				arr[i][1] = 5.0;
			}
		}
		double sum = 0.0;

		for (int i = 0; i < 20; i++) {
			if (arr[i][1] != 5.0) {
				sum += arr[i][0];

			}
		}

		double avg = 0;
		double sum1 = 0;

		for (int i = 0; i < 20; i++) {
			if (arr[i][1] != 5.0) {
				sum1 += arr[i][0] * arr[i][1];
			}
		}
		avg = sum1 / sum;
		System.out.println(avg);

	}

}
