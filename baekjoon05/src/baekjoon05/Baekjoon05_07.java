package baekjoon05;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon05_07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(st.nextToken());
		String str = "";

		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			str = st.nextToken();
			char arr[] = new char[str.length()];

			for (int j = 0; j < arr.length; j++) {
				arr[j] = str.charAt(j);
				for (int z = 0; z < num1; z++) {
					bw.write(arr[j]);
				}

			}
			bw.write("\n");
		}

		bw.flush();
		bw.close();
	}

}
