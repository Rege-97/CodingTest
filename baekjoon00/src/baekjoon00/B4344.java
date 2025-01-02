package baekjoon00;

import java.io.*;
import java.util.*;

public class B4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int cas = Integer.parseInt(br.readLine());

		for (int i = 1; i <= cas; i++) {
			st = new StringTokenizer(br.readLine());
			int student = Integer.parseInt(st.nextToken());
			int arr[] = new int[student];
			int sum = 0;
			double avg = 0;

			for (int j = 0; j < student; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}

			avg = sum / (double) student;
			int count = 0;

			for (int j = 0; j < student; j++) {
				if (arr[j] > avg) {
					count++;
				}
			}

			String result=String.format("%.3f", ((count / (double) student)) * 100);

			bw.write(result + "%\n");

		}
		bw.flush();
		bw.close();

	}

}
